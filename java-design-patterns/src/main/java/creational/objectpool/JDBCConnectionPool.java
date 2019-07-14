package creational.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Enumeration;
import java.util.Hashtable;

abstract class ObjectPool<T> {
	long deadTime;

	Hashtable<T, Long> lock, unlock;

	ObjectPool() {
		deadTime = 50000;
		lock = new Hashtable<T, Long>();
		unlock = new Hashtable<T, Long>();
	}

	abstract T create();

	abstract boolean validate(T o);

	abstract void dead(T o);

	synchronized T takeOut() {
		long now = System.currentTimeMillis();
		T t;
		if (unlock.size() > 0) {
			Enumeration<T> e = unlock.keys();
			while (e.hasMoreElements()) {
				t = e.nextElement();
				if ((now - unlock.get(t) > deadTime)) {
					// Objects are dead
					unlock.remove(t);
					dead(t);
					t = null;
				} else {
					if (validate(t)) {
						unlock.remove(t);
						lock.put(t, now);
						return t;
					} else {
						// Object failed validation
						unlock.remove(t);
						dead(t);
						t = null;
					}
				}
			}
		}

		t = create();
		lock.put(t, now);
		return t;
	}

	synchronized void takeIn(T t) {
		lock.remove(t);
		unlock.put(t, System.currentTimeMillis());
	}

}

public class JDBCConnectionPool extends ObjectPool<Connection> {
	String dsn, usr, pwd;

	JDBCConnectionPool(String driver, String dsn, String usr, String pwd) {
		super();
		try {
			Class.forName(driver).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	Connection create() {
		try {
			return (DriverManager.getConnection(dsn, usr, pwd));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	boolean validate(Connection o) {
		try {
			return !((Connection) o).isClosed();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	void dead(Connection o) {
		try {
			((Connection) o).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package creational.singleton.thirdmethod;

public class Singleton {
	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleton == null)
			return new Singleton();

		return singleton;
	}
}

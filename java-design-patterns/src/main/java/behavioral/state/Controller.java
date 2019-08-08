package behavioral.state;

public class Controller {
	private static Accounting accounting;
	private static Marketing marketing;

	private static Connection connection;

	Controller() {
		accounting = new Accounting();
		marketing = new Marketing();
	}

	public void setAccountingConnection() {
		connection = accounting;
	}

	public void setMarketingConnection() {
		connection = marketing;
	}

	public void open() {
		connection.open();
	}

	public void close() {
		connection.close();
	}

	public void log() {
		connection.log();
	}

	public void update() {
		connection.update();
	}

}

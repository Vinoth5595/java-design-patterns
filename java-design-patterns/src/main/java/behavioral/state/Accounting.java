package behavioral.state;

public class Accounting implements Connection {

	@Override
	public void open() {
		System.out.println("Open for Accounting");
	}

	@Override
	public void close() {
		System.out.println("Close for Accounting");
	}

	@Override
	public void log() {
		System.out.println("Log for Accounting");
	}

	@Override
	public void update() {
		System.out.println("Update for Accounting");
	}

}

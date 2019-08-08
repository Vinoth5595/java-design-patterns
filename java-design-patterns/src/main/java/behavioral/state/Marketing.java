package behavioral.state;

public class Marketing implements Connection {

	@Override
	public void open() {
		System.out.println("Open for Marketing");
	}

	@Override
	public void close() {
		System.out.println("Close for Marketing");
	}

	@Override
	public void log() {
		System.out.println("Log for Marketing");
	}

	@Override
	public void update() {
		System.out.println("Update for Marketing");
	}

}

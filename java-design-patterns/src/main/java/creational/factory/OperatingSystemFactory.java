package creational.factory;

public class OperatingSystemFactory {

	public OperatingSystem getOperatingSystem(String operatingSystem) {
		if (operatingSystem == null) {
			return null;
		}

		if (operatingSystem.equalsIgnoreCase("windows")) {
			return new WindowsOS();
		}

		if (operatingSystem.equalsIgnoreCase("linux")) {
			return new LinuxOS();
		}

		if (operatingSystem.equalsIgnoreCase("mac")) {
			return new MacOS();
		}

		return null;
	}

}

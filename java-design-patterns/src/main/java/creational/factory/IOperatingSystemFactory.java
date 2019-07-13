package creational.factory;

public class IOperatingSystemFactory {
	public IOperatingSystem getOperatingSystem(String operatingSystem) {
		if (operatingSystem == null) {
			return null;
		}

		if (operatingSystem.equalsIgnoreCase("windows")) {
			return new IWindowsOS();
		}

		if (operatingSystem.equalsIgnoreCase("linux")) {
			return new ILinuxOS();
		}

		if (operatingSystem.equalsIgnoreCase("mac")) {
			return new IMacOS();
		}

		return null;
	}
}

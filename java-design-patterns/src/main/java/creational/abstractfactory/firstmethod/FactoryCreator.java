package creational.abstractfactory.firstmethod;

public class FactoryCreator {
	public static AbstractFactory getFactory(String factory) {
		if (factory == null)
			return null;

		if (factory.equalsIgnoreCase("bike")) {
			return new BikeFactory();
		}

		if (factory.equalsIgnoreCase("car")) {
			return new CarFactory();
		}

		return null;
	}

}

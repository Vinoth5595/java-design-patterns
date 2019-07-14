package creational.abstractfactory.firstmethod;

public class BikeFactory implements AbstractFactory {
	public Bike getBikeFactory(String bike) {
		if (bike == null) {
			return null;
		}

		if (bike.equalsIgnoreCase("pulsar")) {
			return new PulsarBike();
		}

		if (bike.equalsIgnoreCase("yamaha")) {
			return new YamahaBike();
		}

		return null;
	}

	public Car getCarFactory(String car) {
		return null;
	}
}

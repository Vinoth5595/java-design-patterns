package creational.abstractfactory.firstmethod;

public class CarFactory implements AbstractFactory {
	public Car getCarFactory(String car) {
		if (car == null) {
			return null;
		}

		if (car.equalsIgnoreCase("audi")) {
			return new AudiCar();
		}

		if (car.equalsIgnoreCase("benz")) {
			return new BenzCar();
		}
		return null;
	}

	public Bike getBikeFactory(String bike) {
		return null;
	}
}

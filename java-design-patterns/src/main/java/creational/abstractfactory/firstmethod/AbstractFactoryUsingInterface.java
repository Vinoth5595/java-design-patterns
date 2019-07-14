package creational.abstractfactory.firstmethod;

public class AbstractFactoryUsingInterface {

	public static void main(String[] args) {
		AbstractFactory bikeFactory = FactoryCreator.getFactory("bike");
		Bike pulsar = bikeFactory.getBikeFactory("pulsar");
		System.out.println(pulsar.getBike());

		Bike yamaha = bikeFactory.getBikeFactory("yamaha");
		System.out.println(yamaha.getBike());

		AbstractFactory carFactory = FactoryCreator.getFactory("car");
		Car audi = carFactory.getCarFactory("audi");
		System.out.println(audi.getCar());

		Car benz = carFactory.getCarFactory("benz");
		System.out.println(benz.getCar());

	}

}

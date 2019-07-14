package creational.abstractfactory.firstmethod;

public interface AbstractFactory {
	public Bike getBikeFactory(String bike);

	public Car getCarFactory(String car);
}

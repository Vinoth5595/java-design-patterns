package creational.factory;

import java.util.Scanner;

public class FactoryDesignPatternUsingAbstract {

	public static void main(String[] args) {
		/*
		 * Creational design patterns are concerned with the way of creating objects.
		 * These design patterns are used when a decision must be made at the time of
		 * instantiation of a class (i.e. creating an object of a class).
		 * 
		 * 
		 * A Factory Pattern or Factory Method Pattern says that just define an
		 * interface or abstract class for creating an object but let the subclasses
		 * decide which class to instantiate. In other words, subclasses are responsible
		 * to create the instance of the class.
		 * 
		 * The Factory Method Pattern is also known as Virtual Constructor.
		 * 
		 */

		// workable inputs - windows/linux/mac
		System.out.println("Enter valid inputs:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
		OperatingSystem operatingSystem = operatingSystemFactory.getOperatingSystem(input);
		System.out.println(operatingSystem.getOS());
		
		
		
	}
}

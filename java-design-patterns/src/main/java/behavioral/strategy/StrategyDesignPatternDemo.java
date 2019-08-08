package behavioral.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyDesignPatternDemo {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first value:");
		float a = 0.0f;
		try {
			a = Float.parseFloat(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		System.out.println("Enter the second value:");
		float b = 0.0f;
		try {
			b = Float.parseFloat(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		Context context = new Context(new Addition());
		System.out.println("Addition::" + context.executeStrategy(a, b));
		context = new Context(new Subtraction());
		System.out.println("Subtraction::" + context.executeStrategy(a, b));
		context = new Context(new Multiplication());
		System.out.println("Multiplication::" + context.executeStrategy(a, b));
	}

}

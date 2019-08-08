package behavioral.state;

import java.util.Scanner;

public class StateDesignPatternDemo {

	public static void main(String[] args) {
		Controller controller = new Controller();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter (Accounting/Marketing)");
		String input = scanner.next().trim();
		System.out.println(input);
		if (input.equalsIgnoreCase("accounting")) {
			controller.setAccountingConnection();
		} else if (input.equalsIgnoreCase("marketing")) {
			controller.setMarketingConnection();
		} else {
			System.out.println("Invalid input!!!");
			System.exit(0);
		}

		controller.open();
		controller.update();
		controller.log();
		controller.close();

	}

}

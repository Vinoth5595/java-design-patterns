package structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeDesignPatternDemo {
	private static int choice;

	public static void main(String[] args) {
		do {
			System.out.println("++++++++++Mobile Shop++++++++++++");
			System.out.println("1. Iphone");
			System.out.println("2. Samsung");
			System.out.println("3. Xiaomi");
			System.out.println("4. Exit");
			System.out.println("++++++++++Mobile Shop++++++++++++");

			System.out.println("Enter your choice...");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				choice = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			ShopKeeper shopkeeper = new ShopKeeper();

			switch (choice) {
			case 1:
				shopkeeper.iPhoneSale();
				break;
			case 2:
				shopkeeper.samsungSale();
				break;
			case 3:
				shopkeeper.xiaomiSale();
				break;
			default:
				System.out.println("Not Valid!!!");
				return;
			}

		} while (choice <= 4);
	}

}

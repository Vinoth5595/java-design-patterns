package structural.decorator;

public class DecoratorDesignPatternDemo {

	public static void main(String[] args) {
		// create new margherita pizza
		Pizza pizza = new Margherita();
		System.out.println(pizza.getDescription() + " Cost :" + pizza.getCost());
		
		Pizza pizza1 = new Paneer(pizza);
		System.out.println(pizza1.getDescription() + " Cost :" + pizza1.getCost());
		
		Pizza pizza2 = new FreshTomato(pizza);
		System.out.println(pizza2.getDescription() + " Cost :" + pizza2.getCost());
	}

}

package behavioral.iterator;

public class IteratorDesignPatternDemo {

	public static void main(String[] args) {

		for (Iterator iterator = new CollectionOfNames().getIterator(); iterator.hasNext();) {
			System.out.println("Name :: " + iterator.next());
		}
	}

}

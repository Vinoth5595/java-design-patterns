package structural.adapter;

public class AdapterDesignPatternDemo {
	/**
	 * Adapter Design pattern (Behavioral)
	 */

	public static void main(String[] args) {
		TargetInterface targetInterface = new AdapterClass();
		targetInterface.getExistingData();
		targetInterface.newClientData();
	}

}

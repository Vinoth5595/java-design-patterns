package structural.adapter;

public class AdapterDesignPatternDemo {
	/**
	 * Adapter Design pattern (Structural)
	 */

	public static void main(String[] args) {
		TargetInterface targetInterface = new AdapterClass();
		targetInterface.getExistingData();
		targetInterface.newClientData();
	}

}

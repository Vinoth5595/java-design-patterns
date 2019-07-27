package structural.proxy;

public class ProxyDesignPatternDemo {

	public static void main(String[] args) {
		OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess("vinoth");
		officeInternetAccess.grantInternetAccess();
		officeInternetAccess = new ProxyInternetAccess("john doe");
		officeInternetAccess.grantInternetAccess();
	}

}

package structural.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {
	private String employeeName;
	private RealInternetAccess realInternetAccess;

	public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {
		if (getRole(employeeName) > 4) {
			realInternetAccess = new RealInternetAccess(employeeName);
			realInternetAccess.grantInternetAccess();
		} else {
			System.out.println("No Internet Access Granted!!!");
		}
	}

	public int getRole(String emplName) {
		if (emplName.equalsIgnoreCase("vinoth")) {
			return 5;
		} else if (emplName.equalsIgnoreCase("john doe")) {
			return 2;
		}

		// Check role from the database based on Name and designation
		// return job level or job designation.
		return 0;
	}

}

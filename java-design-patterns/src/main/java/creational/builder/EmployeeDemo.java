package creational.builder;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee employee = new Employee.Builder().id(1).name("Java").age(24).build();
		System.out.println(employee);
		
		Employee employee1 = new Employee.Builder().id(1).age(21).build();
		System.out.println(employee1);
	}

}

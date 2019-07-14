package creational.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Employee employee = new Employee(1,"Java",24);
		Employee cloning = (Employee) employee.getClone();
		System.out.println(employee);
		System.out.println(cloning);
	}

}

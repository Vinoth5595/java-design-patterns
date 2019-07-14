package creational.prototype;

public class Employee implements Prototype {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Employee() {

	}

	Employee(int id, String name, int age) {
		this();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public Prototype getClone() {
		return new Employee(id, name, age);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

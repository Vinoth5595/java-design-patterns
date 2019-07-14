package creational.builder;

public class Employee {

	private int id;
	private String name;
	private int age;

	public static class Builder {
		private int id;
		private String name;
		private int age;

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}

	}

	private Employee(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.age = builder.age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

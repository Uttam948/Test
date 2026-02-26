package practices1;

public class Employee {
	
	
	private String id;
	private String name;
	private String number;
	private int age;
	private String salary;
		
	
	public Employee(String id, String name, String number, int age, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.age = age;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

	

}

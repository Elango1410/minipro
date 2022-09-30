package javaminiProject;

public class Teacher {
	private int id;
	private String name;
	private int contactNo;
	private int salary;
	
	public Teacher() {
		super();
	}
	public Teacher(int id, String name, int salary, int contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.contactNo = contactNo;
	}
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
	
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teachers [id=" + id + ", name=" + name + ", salary=" + salary + ", contactNo=" + contactNo + "]";
	}
	
	
}

package SpringAssignment.Employee;

public class Employee
{
	String name;
	int id;
	String company;
	
	public Employee()
	{}
	

	public Employee(String name, int id, String company) {
		super();
		this.name = name;
		this.id = id;
		this.company = company;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", company=" + company + "]";
	}
	
}

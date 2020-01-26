package SpringAssignment.Employee;

import java.util.Map;


public class EmployeeMap
{
	Map<Integer, Employee> empMap;
	
	public EmployeeMap()
	{}

	public EmployeeMap(Map<Integer, Employee> empMap) {
		super();
		this.empMap = empMap;
	}

	public Map<Integer, Employee> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(Map<Integer, Employee> empMap) {
		this.empMap = empMap;
	}

	@Override
	public String toString() {
		return "EmployeeMap [empMap=" + empMap + "]";
	}
	
	
	
}

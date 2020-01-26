package SpringAssignment.SpringMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringAssignment.Employee.EmployeeMap;

public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/spring.xml");
		EmployeeMap emp = context.getBean(EmployeeMap.class);
		System.out.println(emp);

	}

}

package com.SpringAU.AOp.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.SpringAU.AOp.assignment.Service.EmployeeService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AssignmentApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(AssignmentApplication.class, args);
		EmployeeService emp= app.getBean(EmployeeService.class);
		emp.getall();;
	}

}

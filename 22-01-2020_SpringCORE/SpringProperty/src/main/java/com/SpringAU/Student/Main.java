package com.SpringAU.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SpringAU.ApplicationConfig.ApplicationConfig;

public class Main
{
	public static void main(String args[])
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student std = (Student) context.getBean("std1");
		System.out.println(std);

	}
}

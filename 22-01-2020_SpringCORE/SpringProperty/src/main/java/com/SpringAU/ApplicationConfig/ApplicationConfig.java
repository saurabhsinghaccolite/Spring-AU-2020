package com.SpringAU.ApplicationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.SpringAU.Student.Student;


@Configuration
@PropertySource("prop.properties")

public class ApplicationConfig
{
	@Autowired
	public Environment environment;
	
	@Bean(name = "std1")
	public Student getValueFromProperty() {
		Student std = new Student();
		std.setName(this.environment.getProperty("name"));
		int age=Integer.parseInt(this.environment.getProperty("age"));
		std.setAge(age);
		return std;
	}

}

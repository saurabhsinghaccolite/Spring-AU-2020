package com.SpringAU.AOp.assignment.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect
{
	public static long start;
	
	@Before("execution(* com.SpringAU.AOp.assignment.Service.EmployeeService.getall(..))")
	public void logBeforV1(JoinPoint joinPoint) 
	{
		start = System.currentTimeMillis();
		System.out.println(joinPoint.getSignature().getName()+" Started executing");
	}
	
	@After("execution(* com.SpringAU.AOp.assignment.Service.EmployeeService.getall(..))")
	public void logAfterV1(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName()+" finished executing");
		System.out.println("Method Execution Time is : " +(System.currentTimeMillis() - start + "ms"));
		
	}
	
}

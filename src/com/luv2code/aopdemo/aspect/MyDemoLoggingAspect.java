package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))") //in the aopdemo.dao package, no matter the class or method
	private void forDAOPackage() {};
	
	
	
	@Before("forDAOPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n==========>>> Executing @Before advice on add-methods");
	}
}

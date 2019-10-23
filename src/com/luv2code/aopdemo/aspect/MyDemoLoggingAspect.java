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
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	private void getter() {};
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	private void setter() {};
	
	
	
	@Before("forDAOPackage() && !(getter() || setter())")
	public void adviseForNotGetterORSetter() {
		System.out.println("\n==========>>> Executing @Before advice ON ANYTHING IN DAO BUT GETTERS AND SETTERS");
	}
	
	
	@Before("forDAOPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n==========>>> Executing @Before advice on add-methods");
	}
	
	@Before("forDAOPackage()")
	public void performAPIAnalytics() {
		System.out.println("\n==========>>> Executing @Before PERFORMING SOME API ANALYTICS");
	}
	
	
	
	
}

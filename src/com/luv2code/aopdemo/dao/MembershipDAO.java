package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addAccount() {
		System.out.println(getClass() + " Adding a membership account...");
	}
	
	public void addSillyStuff() {
		
		System.out.println("PRINTING SILLY STUFF FROM " + getClass());
	}
	
	public void goToSleep() {
		System.out.println("GO TO SLEEP ZZZZZZZZZZZZ");
	}
	
}

package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	private String name;
	
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + " Creating an account in the database...");
	}

	public boolean doWork() {
		System.out.println("DO WORK");
		return false;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

package com.flm;

public class OppsEmp {
	
	String name;
	int age;
	int salary;
	int exp;
	
	
	void bonous() {
		if(exp>=5) {
			System.out.println("Bonous to "+name+" is : "+salary*20/100);
		}
		else {
			System.out.println("Bonous to "+name+" is : "+salary*10/100);
		}
	}

}

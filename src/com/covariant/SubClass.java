package com.covariant;

public class SubClass extends SuperClass {
	
	//@Override 
	//Won't allow covariance in the parameter
	public void show(SubClass subClass) {
		System.out.println("SubClass");
	}
	
	public void show(SubClassTest subClass) {
		System.out.println("SubClassTest");
	}
	
	@Override
	public void show(SuperClass subClass) {
		System.out.println("SubSuperClass");
	}

}

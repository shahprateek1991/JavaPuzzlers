package com.covariant;

public class MainApp {

	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		SubClass subClass = new SubClass();
		SuperClass superSubClass = new SubClass();
		superClass.show(superClass); //calls super class show
		
		subClass.show(subClass); //calls sub class show method with exact signature match
		subClass.show(superClass); //calls sub class's overridden method
		
		superSubClass.show(superClass); // calls sub class overridden method
		superSubClass.show(subClass); // calls sub class overridden method
		
		superSubClass.show(new SubClassTest()); // calls sub class overridden method
		

	}

}

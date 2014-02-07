package com.excelonline.core.inheritance;

public abstract class Employee {

	public abstract void wearTie();
	protected String name = "Jayram Rout";
	public Employee(){
		System.out.println("Employee.Employee()");
	}
	
	public Employee(String name){
		System.out.println("Employee.Employee() With name");
	}
	
	public void wearWatch(){
		System.out.println("Wear Black Color Watch... From Parent");
	}
	
	public void wearDressCode(){
		System.out.println("Black Pant and White Shirt");
	}
	
	public void timing(){
		System.out.println("Employee.timing()");
	}
	
}
package com.excelonline.core.inheritance.hierarchy;

public class Tiger extends Cat{
	public Tiger(){
	}
	public void legsLength(){
		System.out.println("2 meter Tiger");
	}
	@Override
	public void color() {
		System.out.println("I am Tiger  with color Yellow");	
	}
	@Override
	public void jumpCapacity() {
		System.out.println("I am jump like a DANGER TIGER");
	}
	@Override
	public void eatCapacity() {
		// TODO Auto-generated method stub
	}
}

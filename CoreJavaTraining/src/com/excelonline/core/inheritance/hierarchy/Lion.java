package com.excelonline.core.inheritance.hierarchy;

public class Lion extends Cat{
	public Lion(){
	}
	public void legsLength(){
		System.out.println("3 meter Lion");
	}

	@Override
	public void color() {
		System.out.println("I am Lion  with color Brown");
	}
	@Override
	public void jumpCapacity() {
		System.out.println("I am jump like a BIG CAT");
	}
	@Override
	public void eatCapacity() {
		// TODO Auto-generated method stub
		
	}
}

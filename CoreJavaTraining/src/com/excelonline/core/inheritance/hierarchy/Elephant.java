package com.excelonline.core.inheritance.hierarchy;

public class Elephant extends Animal{
	public Elephant(){
	}
	public void legsLength(){
		System.out.println("5 meter Elephant");
	}
	@Override
	public void color() {
		System.out.println("Elephant is Black");
	}
}

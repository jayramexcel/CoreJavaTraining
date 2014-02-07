package com.excelonline.core.inheritance.hierarchy;

public class PolymorphismTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Jumper jump = new Lion();
		jump.jumpCapacity();
		
		jump = new Person();
		jump.jumpCapacity();
	}
}

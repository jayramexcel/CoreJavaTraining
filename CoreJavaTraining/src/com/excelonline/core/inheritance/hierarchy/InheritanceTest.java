package com.excelonline.core.inheritance.hierarchy;

public class InheritanceTest {
	public static void printLegLength(Animal animal){
		System.out.println("***********");
		animal.legsLength();
		System.out.println("***********");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Animal animal = new Zebra();
//		animal.color();
//		animal.legsLength();
////		z.runFast();
//		
//		System.out.println("\n");
//		
//		animal = new Elephant();
//		animal.color();
//		animal.legsLength();
		
		Zebra z = new Zebra();
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		
		printLegLength(tiger);
		printLegLength(lion);
		printLegLength(z);
	}
	
}

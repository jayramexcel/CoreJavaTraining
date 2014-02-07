package com.excelonline.test;
/**
 * Autoboxing converts the premitive data type to Wrapper automatically .and vice versa
 * @author Jayram
 *
 */
public class AutoBoxing {
	public static void main(String... args) {
		int i = 100;
		Integer ij = i; // Here converstion from primitive to Wrapper is done
		
		Integer ii = new Integer(100);
		
		AutoBoxing test = new AutoBoxing();
		test.callMe(i); // Here I am passing an primitive data type to a method which has Wrapper Argument.
	}
	
//	public void callMe(int i ){
//		System.out.println("int " + i);
//	}

	public void callMe(Integer i ){
		System.out.println("INTEGER " + i);
	}
}
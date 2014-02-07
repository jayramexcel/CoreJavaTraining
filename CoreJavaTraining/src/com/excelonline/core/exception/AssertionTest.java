package com.excelonline.core.exception;

public class AssertionTest {
	public void callMe(){
		System.out.println("AssertionTest.callMe()");
		assert (3==2) : invokeMe();
	}
	public AssertionTest invokeMe(){
		return new AssertionTest();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new AssertionTest().callMe();
	}
}
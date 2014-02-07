package com.excelonline.test;

public class Testing{
	public static void main(String... args) {
		int i = 100;
		Integer ij = i;
		
		Integer ii = new Integer(100);
		
		Testing test = new Testing();
		test.callMe(i);
	}
	
//	public void callMe(int i ){
//		System.out.println("int " + i);
//	}

	public void callMe(Integer i ){
		System.out.println("INTEGER " + i);
	}
}
package com.excelonline.core.exception;

import com.excelonline.core.io.Person;

public class ExceptionTest {
	int i ;
	Person p;
	
	public void callMe() {
		System.out.println("I am in callMe Method " + p);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExceptionTest test = null;
//		test.callMe();
		int i[] = new int[5]; //i[4] 01234 5
		
		int j = 0;
		try{
			test.callMe();
			 j  = 20/2;
			 j = i[2];
			 
		}catch(ArithmeticException e){
			System.out.println("I m in Arithemetic");
			e.printStackTrace();
//			i = 30;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("I m in ArrayException");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("I m in Exception");
			e.printStackTrace();
		}
	}
}
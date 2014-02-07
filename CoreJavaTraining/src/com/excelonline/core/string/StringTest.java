package com.excelonline.core.string;

public class StringTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "ONE"; 
		
		str1 = str1.concat("TWO");
		str1 = str1 + " THREE";
		
		
		System.out.println("StringTest.main()" + str1);
//		String str2 = new String("ONE");
//		
		String str3 = "ONE";
		
		String str4 = new String("ONE");
		String str7 = new String("ONE");
		String str8 = new String("ONE");
		
//		String str5 = str1;
//		
//		System.out.println(str1.equals(str2));
//		
//		System.out.println(str1.intern() == str2.intern());
		
		
//		System.out.println((str1.equals(str2)));
//		
//		System.out.println(str1 == str5);
//		
//		System.out.println(str1 == str3);
//		
		StringBuffer buffer = new StringBuffer();
		buffer = buffer.append("ONE").append("TWO");
		buffer.append("THREE");
		
		StringBuilder builder = new StringBuilder();
		
		
	}
}
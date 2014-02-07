package com.excelonline.test;

import com.excelonline.student.PavanLaptop;

public class PavanTest {
	String  name ="";
	String place = "";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PavanTest test = new PavanTest();
		test.name = "Pavan";
		test.place = "HYD";
		
//		System.out.println("PavanTest.main()" + test.name +" "+ test.place);
		
		PavanTest test2 = new PavanTest();
		test2.name = "Jayram";
		test2.place = "USA";
		
		System.out.println("PavanTest.main() 2 " + test2.name +" "+ test2.place);
		System.out.println("PavanTest.main() 1 " + test.name +" "+ test.place);
		
		PavanTest test3 = test2;
		
		System.out.println("PavanTest.main() 3 " + test3.name +" "+ test3.place);
		test3.name = "Rakesh";
		
		
		System.out.println("PavanTest.main() 3 ---" + test3.name +" "+ test3.place);
		System.out.println("PavanTest.main() 2 ---" + test2.name +" "+ test2.place);
		
	}
	
}
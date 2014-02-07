package com.excelonline.core.staticExample;

class Student{
	public static final String NAME = "Jayram";
	public String place = "Hyderabad";
	public void callMe(){
		System.out.println("StaticExample.callMe()");
	}
}
public class StaticExample {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("StaticExample.main()");
		//Student.NAME = "rajesh"; // Final Variable cannot be changed
		
		System.out.println("StaticExample.main()" + Student.NAME);
		Student stud = new Student();
		
		System.out.println("StaticExample.main()" + new Student().place);
		stud.callMe();
		
		new StaticExample().goodBye();
		goodMorning();
	}
	
	static{
		System.out.println("StaticExample.enclosing_method()");
	}
	
	public void goodBye(){
		
		goodMorning();
	}
	public static void goodMorning(){
	}
	
	
}
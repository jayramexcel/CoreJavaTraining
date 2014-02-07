package com.excelonline.test;

class Student{
	String name;
	int id; //Integer
	String place;
	
	public Student(){
		System.out.println("Set Place" );
		this.place = "HYD Ameerpet";
	}
	public Student(int id){
		this();
		System.out.println("Set ID" );
		this.id = id+2;
	}
	
	public Student(String name, int id){
		this(id);
		System.out.println("Set Name" );
		this.name = name;
	}
}

public class ConstructorTest {
	String printMe ="HELLO Instance Variable";
	
	public static void main(String[] args) {
		Student stud = new Student("Jayram",100);
//		System.out.println("ConstructorTest.main()" + stud.name +" "+ stud.id +" "+ stud.place);
		
//		ConstructorTest test = new ConstructorTest();
//		test.callMe("HELLO");
	}
	
	public void callMe(String printMe){
		
		printMe ="Local Variable";	
		
		System.out.println("ConstructorTest.callMe()" + printMe);
		callYou();
	}
	
	public void callYou(){
		
	}
	
}
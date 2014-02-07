package com.excelonline.test;

class RockStudent{
	String name = "Jayram";
	String place = "Concord";
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name :"+name +" Place :"+place;
	}
}
public class ToStringExample {
	public static void main(String[] args) {
		RockStudent stud = new RockStudent();
		System.out.println(stud);
	}
}
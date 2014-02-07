package com.excelonline.core.collection;

import java.util.ArrayList;
import java.util.List;

class MyGenericsString {
	public void callMe(String value){
		System.out.println("GenericsList.callMe(Generics)" + value);
	}
}

class MyGenericsInteger {
	public void callMe(Integer value){
		System.out.println("GenericsList.callMe(Generics)" + value);
	}
}

public class GenericsList<T> {
	
/*	public static void callMe(String intr){
		System.out.println("GenericsList.callMe(String)" + intr);
	}
*/	
	public <T> void callMe(T value){
		System.out.println("GenericsList.callMe(Generics)" + value);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		callMe(new GenericsList());
		
		GenericsList<String> gen = new GenericsList<String>();
		gen.callMe("");
		
//		List<String> listOfString = new ArrayList<String>();
//		List listOfString = new ArrayList();
		/*
		listOfString.add("hello");
		listOfString.add("how");
		listOfString.add("are");
		listOfString.add("you");
		listOfString.add(new GenericsList());
		*/
//		listOfString.add(new Integer(10));
//		System.out.println("GenericsList.main()" + listOfString);
		
	}
}
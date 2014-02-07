package com.excelonline.test;


class CheckEquality1{
	String name;
	String rollno;

	public CheckEquality1(String name , String rollno) {
		this.name = name;
		this.rollno = rollno;
	}
}

public class CallByValRef{

	public static void callValue(int i , int j){

		i = 2;
		j = 3;
	}

	public static void callRef(CheckEquality1 chk){
		chk.name = "Rout";
	}
	
	public static void main(String... args) {
		CheckEquality1 chk = new CheckEquality1("Jay", "001");


//		callRef(chk);
//		log.info("After " + chk.name);
		
		int i =10 , j =20;
		try{
			int div = i/0;
		}catch(Exception e){
		}
		callValue(i,j);

	}
}
/**
Trace
Debug
Info
Warn
Error
Fatal
*/
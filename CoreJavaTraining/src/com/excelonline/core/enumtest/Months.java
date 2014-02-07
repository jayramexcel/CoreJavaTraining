package com.excelonline.core.enumtest;

enum Months {
		JAN(1),FEB(2);
		
	Months(int monthInt){
		this.monthInt = monthInt;
	}
	
	private int monthInt;
	public int getMonth(){
		return this.monthInt;
	}
};
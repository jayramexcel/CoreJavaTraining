package com.excelonline.core.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDemo {
	public int addMe(int i , int j){
		return i+j;
	}
	public int addMe(int i , int j , int k){
		return i+j+k;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalendarDemo demo = new CalendarDemo();
//		demo.addMe(2,3);
		
		int value  = 4  + demo.addMe(5,3,4);
//		System.out.println("CalendarDemo.main()" + value);
		
		Date d = new Date();
		System.out.println("CalendarDemo.main()" + d);
		
		Calendar cal = Calendar.getInstance();
		System.out.println("CalendarDemo.main()" + cal);
		
		// he2llo s3i r
		String months[] = {
				"Jan", "Feb", "Mar", "Apr",
				"May", "Jun", "Jul", "Aug",
				"Sep", "Oct", "Nov", "Dec"};

		GregorianCalendar gcalendar = new GregorianCalendar();
		int i  = gcalendar.get(Calendar.MONTH);
		System.out.println("CalendarDemo.main()" + months[i]);

		
		
	}
}
package com.excelonline.core.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dNow = new Date();
		// System.out.println("DateDemo.main()" + dNow);

		SimpleDateFormat ft = new SimpleDateFormat(
				"E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current Date: " + ft.format(dNow));

		// String str = String.format("Current Date/Time : %tc", dNow );
		System.out.printf("Current Date/Time : %tc", dNow);
	}
}
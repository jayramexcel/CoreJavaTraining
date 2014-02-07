package com.excelonline.test;

public class BooleanIfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if example
		int i = 10;
		if (i < 20) {
			System.out.print("This is if statement");
		}
		// if..else example
		System.out.println("\nif..else example\n");
		int x = 30;
		if (x < 20) {
			System.out.print("This is if statement");
		} else {
			System.out.print("This is else statement");
		}
		// if..else..if..else example
		System.out.println("\nif..else..if..else example\n");
		int j = 30;
		if (j == 10) {
			System.out.print("Value of j is 10");
		} else if (j == 20) {
			System.out.print("Value of j is 20");
		} else if (j == 30) {
			System.out.print("Value of j is 30");
		} else {
			System.out.print("This is else statement");
		}
		// nested if example
		System.out.println("\nnested if example\n");
		int a = 30;
		int b = 10;
		if (a == 30) {
			if (b == 10) {
				System.out.print("a = 30 and b = 10");
			}
		}
	}

}

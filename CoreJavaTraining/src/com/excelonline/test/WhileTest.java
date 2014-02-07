package com.excelonline.test;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while loop example
		int x = 10;
		while (x < 20) {
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\r");
		}
		// do... while example
		int y = 10;
		do {
			System.out.print("value of y : " + y);
			y++;
			System.out.print("\n");
		} while (y < 20);
		// for loop example
		for (int z = 10; z < 20; z = z + 1) {
			System.out.print("value of z : " + z);
			System.out.print("\n");
		}
		// enhaned for loop example
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int i : numbers) {
			System.out.print(i);
			System.out.print(",");
		}
		System.out.print("\n");
		String[] names = { "James", "Larry", "Tom", "Lacy" };
		for (String name : names) {
			System.out.print(name);
			System.out.print(",");
		}
	}

}

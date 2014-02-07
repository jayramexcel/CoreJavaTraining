package com.excelonline.test;

public class BreakContinue {

	public static void main(String[] args) {
		// Break example
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int x : numbers) {
			if (x == 30) {
				break;
			}
			System.out.print(x);
			System.out.print("\n");
		}
		// continue example
		System.out.println("continue example");
		int[] numbersc = { 10, 20, 30, 40, 50 };
		for (int y : numbersc) {
			if (y == 30) {
				continue;
			}
			System.out.print(y);
			System.out.print("\n");
		}
	}

}

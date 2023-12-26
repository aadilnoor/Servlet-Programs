package org.logic;

import java.util.Scanner;

public class Even_Odd_Number {

	public static String Even_Odd(int num) {
		String result = "Odd Number";

		if (num % 2 == 0) {
			result = "Even Number";
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String s = Even_Odd(n);

		System.out.println(s);

	}

}

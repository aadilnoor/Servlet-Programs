package org.logic;

import java.util.Scanner;

public class Leap_Year {

	public static void leapyYearFind(int year) {

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Leap year");
				} else {
					System.out.println("Not Leap Year");
				}
			} else {
				System.out.println("Leap Year");
			}

		} else {
			System.out.println("Not Leap Year");
		}

	}

	public static void main(String[] args) {

		System.out.println("Enter Year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		leapyYearFind(year);

	}

}

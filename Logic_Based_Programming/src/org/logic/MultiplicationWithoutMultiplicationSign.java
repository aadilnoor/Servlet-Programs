package org.logic;
import java.util.Scanner;
public class MultiplicationWithoutMultiplicationSign {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        int result = multiplyWithoutMultiplicationSign(num1, num2);

	        System.out.println("Multiplication without using * sign: " + result);

	        scanner.close();
	    }

	    private static int multiplyWithoutMultiplicationSign(int a, int b) {
	        int result = 0;

	       
	        if (b < 0) {
	            a = -a;
	            b = -b;
	        }

	        for (int i = 0; i < b; i++) {
	            result += a;
	        }

	        return result;
	    }
	}



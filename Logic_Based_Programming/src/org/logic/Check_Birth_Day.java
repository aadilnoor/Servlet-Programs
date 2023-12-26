package org.logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Check_Birth_Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter your birth day: ");
            int day = scanner.nextInt();

            // Check if the day is valid
            if (day < 1 || day > 31) {
                System.out.println("Invalid birth day");
                return;
            }

            // ... do something with the   birth day ...
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer value for the birth day");
        }
        
    }
}
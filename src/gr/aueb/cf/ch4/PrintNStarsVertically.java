package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * This program prints a specified number of stars vertically.
 * The user is prompted to enter the number of stars to print.
 * If the input is negative, it prompts the user to enter a non-negative integer.
 */
public class PrintNStarsVertically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of times to print stars Vertically: ");
        n = sc.nextInt();

        // Check if the input is a non-negative integer.
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Print the stars n times vertically.
            for (int i = 0; i < n; i++) {
                System.out.println("*");
            }
        }
        System.out.println(); // Print a new line after printing all stars.
    }
}

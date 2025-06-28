package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ελέγχει αν ένα έτος είναι δίσεκτο.
 * Ένα έτος είναι δίσεκτο αν:
 * - Είναι διαιρετό με το 4 και δεν είναι διαιρετό με το 100, ή
 * - Είναι διαιρετό με το 400.
 */
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a year (or 0 to exit): ");
            int year = sc.nextInt();

            if (year == 0) break;

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}

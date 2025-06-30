package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * This program prints a square of stars of size n x n,
 * where n is a positive integer input by the user.
 */
public class PrintNxNStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a positive integer n: ");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

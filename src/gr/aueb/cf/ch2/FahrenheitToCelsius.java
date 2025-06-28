package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
  * Μετατρέπει τη θερμοκρασία από Φαρενάιτ σε Κελσίου.
  * Τύπος: C = (F - 32) * 5 / 9
  */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        int fahrenheit = scn.nextInt();

        int celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}

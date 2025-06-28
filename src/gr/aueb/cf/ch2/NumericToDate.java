package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
* Μετατρέπει αριθμητική είσοδο σε μορφή ημερομηνίας.
* Ο χρήστης εισάγει ημέρα, μήνα και έτος, και το πρόγραμμα εμφανίζει την ημερομηνία σε μορφή "ημέρα/μήνας/έτος".
*/
public class NumericToDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        int month;
        int year;

        System.out.print("Enter day (1-31): ");
        day = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        month = sc.nextInt();
        System.out.print("Enter year (e.g., 2023): ");
        year = sc.nextInt();

        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών και επαναλαμβάνει την εμφάνιση του μενού
 * μέχρι ο χρήστης να δώση έξοδος (5).
 * Ο χρήστης μπορεί να επιλέξει μεταξύ εισαγωγής, διαγραφής, αναζήτησης,
 * ενημέρωσης ή εξόδου από το πρόγραμμα.
 */
public class RepeatMenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
            System.out.println(" ");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Αναζήτηση");
            System.out.println("4. Ενημέρωση");
            System.out.println("5. Έξοδος");
            System.out.println("Δώστε αριθμό επιλογής:");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή.");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή.");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Αναζήτηση.");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Ενημέρωση.");
            } else if (choice == 5) {
                System.out.println("Έξοδος από το πρόγραμμα.");
            } else {
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
            }
        } while (choice != 5);
    }
}

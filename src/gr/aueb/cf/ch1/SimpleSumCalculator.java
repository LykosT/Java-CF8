package gr.aueb.cf.ch1;

/**
 * Απλό πρόγραμμα που υπολογίζει το άθροισμα δύο αριθμών.
 */
public class SimpleSumCalculator {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών.
        int num1 = 19;
        int num2 = 30;
        int sum = 0;

        //εντολές
        sum = num1 + num2;

        //εκτύπωση αποτελέσματος.
        System.out.println("Το αποτέλεσμα είναι: " + sum);
        //εναλλακτικές εκτυπώσεις.
        System.out.printf("Το άθροισμα του %d και του %d ειναι: %d\n", num1, num2, sum);
        System.out.println("Το " + num1 + " + " + num2 + " είναι ίσο με " + sum);

    }
}

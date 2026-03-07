/*
Declare constant integer variable SECONDS_PER_MINUTE and constant double variable FEE_PER_SECOND, and initialize the variables as follows:

SECONDS_PER_MINUTE has value 60.
FEE_PER_SECOND has value 0.25.
The program then reads integer numMinutes from input and calculates the total expense given the number of minutes, using SECONDS_PER_MINUTE and FEE_PER_SECOND.

Ex: If the input is 7, then the output is:

7 minutes = 105.00 dollars
 */

import java.util.Scanner;

public class TotalExpense {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        final int SECONDS_PER_MINUTE = 60;
        final double FEE_PER_SECOND = 0.25;

        int numMinutes;
        double totalExpense;

        numMinutes = scnr.nextInt();

        totalExpense = numMinutes * SECONDS_PER_MINUTE * FEE_PER_SECOND;

        System.out.print(numMinutes + " minutes = ");
        System.out.printf("%.2f", totalExpense);
        System.out.println(" dollars");
    }
}
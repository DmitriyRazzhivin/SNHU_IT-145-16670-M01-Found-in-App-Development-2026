/*
Convert totalPennies to dimes, nickels, and pennies, finding the maximum number of dimes, then nickels, then pennies.

Ex: If the input is 18, then the output is:

Dimes: 1
Nickels: 1
Pennies: 3
Note: A dime is 10 pennies. A nickel is 5 pennies.
 */

import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int totalPennies;
        int numDimes;
        int numNickels;
        int numPennies;

        totalPennies = scnr.nextInt();

        numDimes  = totalPennies / 10;
        totalPennies %=  10;

        numNickels = totalPennies / 5;
        totalPennies %= 5;

        numPennies = totalPennies;

        System.out.println("Dimes: " + numDimes);
        System.out.println("Nickels: " + numNickels);
        System.out.println("Pennies: " + numPennies);
    }
}
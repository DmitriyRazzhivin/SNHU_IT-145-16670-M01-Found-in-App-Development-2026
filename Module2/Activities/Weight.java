/*
Define a private helper method called convertToOunces() that converts the field pounds to ounces and returns a double.

Ex: If the input is 480.0, then the output is:

7680.0 ounces
Note: The equation to convert from pounds to ounces is: ounces = pounds * 16
 */

import java.util.Scanner;

public class Weight {
    private double pounds;

    public void setPounds(double inputPounds) {
        pounds = inputPounds;
    }

    public double getPounds() {
        return pounds;
    }

    private double convertToOunces(){

        double ounces = pounds * 16.0;
        return ounces;

    }

    public void printInOunces() {
        System.out.printf("%.1f ounces\n", convertToOunces());
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Weight weight1 = new Weight();
        double inputPounds;

        inputPounds = scnr.nextDouble();
        weight1.setPounds(inputPounds);

        weight1.printInOunces();
    }
}

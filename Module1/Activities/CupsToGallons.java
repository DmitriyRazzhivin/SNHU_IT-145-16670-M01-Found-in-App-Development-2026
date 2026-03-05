/*
One gallon equals 16 cups. The following program intends to read a floating-point value from input, convert the value from cups to gallons, and output the volume in gallons, but the code contains three errors. Find and fix all three errors.

Ex: If the input is 2.7, then the output is:

0.169 gallons
 */

import java.util.Scanner;

public class CupsToGallons {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // Modify the following code
        double volCups;
        double volGals;

        volCups = scnr.nextDouble();

        volGals = volCups / 16.0;

        System.out.printf("%.3f gallons\n", volGals);
    }
}
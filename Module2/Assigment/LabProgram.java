/*
Write a method drivingCost() with input parameters milesPerGallon, dollarsPerGallon, and milesDriven that returns the dollar cost to drive those miles. All items are of type double. The method called with arguments (20.0, 3.1599, 50.0) returns 7.89975.

Define that method in a program whose inputs are the car's miles per gallon and the price of gas in dollars per gallon (both doubles). Output the gas cost for 10 miles, 50 miles, and 400 miles, by calling your drivingCost() method three times.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

The output ends with a newline.

Ex: If the input is:

20.0 3.1599
the output is:

1.58 7.90 63.20
Your program must define and call a method:
public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven)
 */

import java.util.Scanner;

public class LabProgram {

    /* Define your method here */
    public static double drivingCost (double milesPerGallon, double dollarsPerGallon, double milesDriven){
        double cost;
        cost = (milesDriven / milesPerGallon) * dollarsPerGallon;
        return cost;

    }

    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        double MpG = scnr.nextDouble();
        double dollPerGall = scnr.nextDouble();
        System.out.printf("%.2f ", drivingCost(MpG, dollPerGall, 10.0));
        System.out.printf("%.2f ", drivingCost(MpG, dollPerGall, 50.0));
        System.out.printf("%.2f\n", drivingCost(MpG, dollPerGall, 400.0));
    }
}


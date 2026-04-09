/*
The while loop reads values from input until two integers are read. Write a catch block in the while loop to catch an InputMismatchException exception, and:

Output "Discarded the invalid package's length entered". End with a newline.
Discard the invalid input.
Click here for example 1 (valid input)
Ex: If the input is:
44 38 50
then the output is:

Package's length (in cm) is 44
Package's length (in cm) is 38
Processed two valid input values
Click here for example 2 (invalid input)
Ex: If the input is:
Ben 44 38 50
then the output is:

Discarded the invalid package's length entered
Package's length (in cm) is 44
Package's length (in cm) is 38
Processed two valid input values

 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class TwoPackageLengths {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int packageLength;
        int goodCount = 0;

        while (goodCount < 2) {
            try {
                packageLength = scnr.nextInt();
                System.out.println("Package's length (in cm) is " + packageLength);
                ++goodCount;
            }

            /* Your code goes here */
            catch(InputMismatchException excpt){
                System.out.println("Discarded the invalid package's length entered");
                scnr.next();
            }

        }

        System.out.println("Processed two valid input values");
    }
}
/*
Integer numInput is read from input. Write a while loop that iterates while numInput is non-negative. In each iteration:

Update integer result as follows:
If numInput is even, subtract numInput from result.
Otherwise, add numInput to result.
Then, read the next integer from input into variable numInput.
Click here for example
Ex: If the input is 3 4 6 -8, then the output is:
Result is -7

Note: x % 2 == 0 returns true if x is even.
 */

import java.util.Scanner;

public class ResultCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numInput;
        int result;

        result = 0;
        numInput = scnr.nextInt();

        while (numInput >= 0){

            if(numInput % 2 == 0){
                result -= numInput;
            }
            else{
                result += numInput;
            }

            numInput = scnr.nextInt();

        }

        System.out.println("Result is " + result);
    }
}
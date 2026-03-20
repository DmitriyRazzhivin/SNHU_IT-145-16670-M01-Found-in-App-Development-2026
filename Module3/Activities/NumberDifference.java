/*
Write an if-else statement for the following:

If numDifference is equal to -15, execute totalDifference = -25. Else, execute totalDifference = numDifference.

 */
import java.util.Scanner;

public class NumberDifference {
    public static void main (String [] args) {
        int totalDifference;
        int numDifference;

        Scanner scnr = new Scanner(System.in);
        numDifference = scnr.nextInt(); // Program will be tested with values: -14, -15, -16, -17.

        if(numDifference == -15){
            totalDifference = -25;
        }
        else{
            totalDifference = numDifference;
        }
        System.out.println(totalDifference);
    }
}

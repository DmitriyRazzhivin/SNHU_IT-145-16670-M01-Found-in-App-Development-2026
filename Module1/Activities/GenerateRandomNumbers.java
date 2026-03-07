/*
Integers seedVal, minVal and maxVal are read from input. minVal and maxVal represent the minimum and maximum numbers of keychains to be put in each bowl, respectively. A total of 140 keychains are available. Complete the following tasks:

Call randGen's setSeed() with seedVal as the argument.
Assign variables bowl1, bowl2, bowl3, and bowl4 each with a random number of keychains between minVal and maxVal, both inclusive.
Assign variable remainingKeychains with 140 minus the sum of bowl1, bowl2, bowl3, and bowl4.
 */

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int seedVal;
        int remainingKeychains;
        int minVal;
        int maxVal;
        int bowl1;
        int bowl2;
        int bowl3;
        int bowl4;

        seedVal = scnr.nextInt();
        minVal = scnr.nextInt();
        maxVal = scnr.nextInt();

        System.out.println("Initial: 140");

        /* Your code goes here */
        randGen.setSeed(seedVal);

        bowl1 = randGen.nextInt(maxVal - minVal + 1) + minVal;
        bowl2 = randGen.nextInt(maxVal - minVal + 1) + minVal;
        bowl3 = randGen.nextInt(maxVal - minVal + 1) + minVal;
        bowl4 = randGen.nextInt(maxVal - minVal + 1) + minVal;

        remainingKeychains = 140 - (bowl1 + bowl2 + bowl3 + bowl4);

        System.out.println(bowl1);
        System.out.println(bowl2);
        System.out.println(bowl3);
        System.out.println(bowl4);
        System.out.println("Remainder: " + remainingKeychains);
    }
}
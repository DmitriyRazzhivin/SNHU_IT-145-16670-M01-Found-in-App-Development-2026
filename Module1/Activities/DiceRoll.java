/*

Type two statements using nextInt() to print two random integers between (and including) 0 and 9. End with a newline. Ex:
5
7
Note: For this activity, using one statement may yield different output (due to the interpreter calling randGen.nextInt() in a different order). Use two statements for this activity. (Notes)

 */

import java.util.Scanner;
import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int seedVal;

        seedVal = scnr.nextInt();
        randGen.setSeed(seedVal);

        System.out.println(randGen.nextInt(10));
        System.out.println(randGen.nextInt(10));

    }
}
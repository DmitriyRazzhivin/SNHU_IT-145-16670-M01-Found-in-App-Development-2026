/*
Assume that lions weigh 286 pounds each, llamas weigh 390 pounds each, and bears weigh 420 pounds each. Given variables numLions, numLlamas, and numBears read from input, compute the total weight of all the lions, llamas, and bears, and assign totalWeight with the result.

Ex: If the input is 7 17 38, then the output is:

Weight: 24592
 */

import java.util.Scanner;

public class AnimalWeight {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int lionWeight = 286;
        int llamaWeight = 390;
        int bearWeight = 420;
        int numLions;
        int numLlamas;
        int numBears;
        int totalWeight;

        numLions = scnr.nextInt();
        numLlamas = scnr.nextInt();
        numBears = scnr.nextInt();

        totalWeight = (numLions * lionWeight) + (numLlamas * llamaWeight) + (numBears * bearWeight);

        System.out.println("Weight: " + totalWeight);
    }
}
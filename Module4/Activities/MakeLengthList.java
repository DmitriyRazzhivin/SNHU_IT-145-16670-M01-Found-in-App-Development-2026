/*
Declare and initialize a reference variable for an ArrayList named lengthList that stores items of type Integer. Read integers startLength and numLengths from input. Then, insert the following integers into lengthList: startLength, startLength * 2, startLength * 2 * 2 …, and so on until numLengths integers have been inserted.

Ex: If the input is 2 3, then the output is:

2 4 8
 */
import java.util.Scanner;
import java.util.ArrayList;

public class MakeLengthList {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int startLength;
        int numLengths;
        int nextLength;
        int i;
        ArrayList<Integer> lengthList = new ArrayList<Integer>();

        startLength = scnr.nextInt();
        numLengths = scnr.nextInt();

        for (i = 0; i < numLengths; ++i){


            lengthList.add(startLength);
            startLength *= 2;

        }


        // Traversing a list using indexes
        for (i = 0; i < lengthList.size(); ++i) {
            System.out.print(lengthList.get(i) + " ");
        }
        System.out.println();
    }
}
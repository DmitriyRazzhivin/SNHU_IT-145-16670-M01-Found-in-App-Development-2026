/*
Integer numHeights is read from input. Then, numHeights integers are read from input and inserted at the end of heightList. If an element is at an even index in heightList, negate the element.

Ex: If the input is:

3
40 28 44

then the output is:

-40 28 -44

Note: Index i is even if i % 2 == 0.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class HeightListModification {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Integer> heightList = new ArrayList<Integer>();
        int numHeights;
        int i;

        numHeights = scnr.nextInt();
        for (i = 0; i < numHeights; ++i) {
            heightList.add(scnr.nextInt());
        }


        for (i = 0; i < numHeights; ++i){
            if(i % 2 == 0){
                heightList.set(i, -heightList.get(i));
            }
        }

        for (i = 0; i < heightList.size(); ++i) {
            System.out.print(heightList.get(i) + " ");
        }
        System.out.println();
    }
}
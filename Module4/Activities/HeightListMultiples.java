/*
Integer numHeights is read from input. Then, numHeights integers are read from input and inserted at the end of heightList. Output every element that is divisible by 2 in heightList. End each output with a space.

Ex: If the input is:
2
37 50

then the output is:
50
 */
import java.util.Scanner;
import java.util.ArrayList;

public class HeightListMultiples {
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

            int temp = heightList.get(i);
            if(temp % 2 == 0){
                System.out.print(temp + " ");
            }
        }

        System.out.println();
    }
}
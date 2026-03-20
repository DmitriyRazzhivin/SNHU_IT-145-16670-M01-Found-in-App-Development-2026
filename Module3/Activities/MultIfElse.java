/*
If integer numLegs is:

1, output "Uniped".
2, output "Biped".
Otherwise, output "Other number of legs". End with a newline.
 */

import java.util.Scanner;

public class MultIfElse {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numLegs;

        numLegs = scnr.nextInt();

        if(numLegs == 1){
            System.out.println("Uniped");
        }
        else if(numLegs == 2){
            System.out.println("Biped");
        }
        else{
            System.out.println("Other number of legs");
        }
    }
}
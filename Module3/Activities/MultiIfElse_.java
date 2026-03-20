/*
If integer numLegs is:

1, output "Uniped".
4, output "Quadruped".
6, output "Hexapod".
Otherwise, output "Other number of legs". End with a newline.
 */
import java.util.Scanner;

public class MultiIfElse_ {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numLegs;

        numLegs = scnr.nextInt();

        if(numLegs == 1){
            System.out.println("Uniped");
        }
        else if(numLegs == 4){
            System.out.println("Quadruped");
        }
        else if(numLegs == 6){
            System.out.println("Hexapod");
        }
        else{
            System.out.println("Other number of legs");
        }

    }
}

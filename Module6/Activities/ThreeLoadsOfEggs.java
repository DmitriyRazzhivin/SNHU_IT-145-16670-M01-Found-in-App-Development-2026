/*
The while loop makes multiple attempts to read three integers divisible by 6 from input into numEggs.

Write a catch block to catch any InputMismatchException thrown. In the catch block:
Output "Unexpected input: The ThreeLoadsOfEggs program exits".
Assign retry with false.
Then, write another catch block to catch any Exception thrown. In the catch block, output the Exception's message.
End each output with a newline.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class ThreeLoadsOfEggs {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numEggs;
        int validCount = 0;
        boolean retry = true;

        while ((validCount < 3) && retry) {
            try {
                numEggs = scnr.nextInt();

                if (numEggs % 6 != 0) {
                    throw new Exception("The number of eggs must be divisible by 6");
                }

                validCount = validCount + 1;
                System.out.print("Valid input: ");
                System.out.println(numEggs + " eggs = " + (numEggs / 6) + " cartons of half a dozen");
            }

            catch(InputMismatchException excpt){
                System.out.println("Unexpected input: The ThreeLoadsOfEggs program exits");
                retry = false;
            }

            catch(Exception excpt){
                System.out.println(excpt.getMessage());
            }

        }
    }
}
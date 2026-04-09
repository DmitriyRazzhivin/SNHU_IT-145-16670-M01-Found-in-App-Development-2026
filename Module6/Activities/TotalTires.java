/*
Integer numTires is read from input.

Write a catch block to catch any InputMismatchException thrown and output "Input type error: Integer needed".
Then, write another catch block to catch any Exception thrown and output the Exception's message.
End each output with a newline.

 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class TotalTires {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numTires;

        try {
            numTires = scnr.nextInt();
            if (numTires % 2 != 0) {
                throw new Exception("Value error: Value divisible by 2 needed");
            }
            System.out.print("Valid input: ");
            System.out.println(numTires + " tires can make " + (numTires / 2) + " bicycles");
        }

        catch(InputMismatchException excpt){
            System.out.println("Input type error: Integer needed");
        }

        catch(Exception excpt){
            System.out.println(excpt.getMessage());
        }

    }
}
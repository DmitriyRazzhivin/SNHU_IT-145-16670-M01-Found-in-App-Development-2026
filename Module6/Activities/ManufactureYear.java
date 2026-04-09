/*
Write a try block that:

Reads integer manufactureYear from input.
Outputs "Manufacture year: " followed by the value of manufactureYear. End with a newline.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class ManufactureYear {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int manufactureYear;

        try{
            manufactureYear = scnr.nextInt();
            System.out.println("Manufacture year: " + manufactureYear);
        }

        catch (InputMismatchException excpt) {
            System.out.println("Error: Input for manufacture year is invalid");
        }
    }
}
/*
Integer numCents is read from input. Complete the try block to throw an exception with the message "Error: Amount cannot be converted to nickels".
 */
import java.util.Scanner;

public class TotalCents {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numCents;

        try {
            numCents = scnr.nextInt();
            if (numCents % 5 != 0) {
                throw new Exception("Error: Amount cannot be converted to nickels");
            }
            System.out.print("Valid input: ");
            System.out.println(numCents + " cents = " + (numCents / 5) + " nickels");
        }
        catch (Exception excpt) {
            System.out.println(excpt.getMessage());
        }
    }
}
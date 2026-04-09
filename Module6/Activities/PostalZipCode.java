/*
Write a catch block to catch an InputMismatchException exception, and output "Error: Bad input value for postal ZIP code". End with a newline.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class PostalZipCode {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int postalZipCode;

        try {
            postalZipCode = scnr.nextInt();
            System.out.println("Postal ZIP code: " + postalZipCode);
        }
        catch(InputMismatchException excpt){
            System.out.println("Error: Bad input value for postal ZIP code");
        }

    }
}

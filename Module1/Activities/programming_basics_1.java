/*
The program uses scnr.nextInt() to read a user-entered integer from input into variable numPeaches.

Complete the program with one System.out.println() statement to output "My recipe needs ", followed by the variable numPeaches and " peaches."

Note: System.out.println() automatically ends the output with a newline.

 */
import java.util.Scanner;
public class programming_basics_1

{
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            int numPeaches;

            numPeaches = scnr.nextInt(); // Reads numPeaches from input

            System.out.println("My recipe needs " + numPeaches + " peaches.");

    }
}

/*
Complete the code to output "k = " followed by the value of k to three digits after the decimal point. On the same line, output " when c = " followed by the value of c to one digit after the decimal point. End with a newline.

Ex: If the input is 3.8, then the output is:

k = -160.800 when c = 3.8
Note: System.out.printf() can be used with "%.Xf" to output a double to X digits after the decimal point.

 */
import java.util.Scanner;
public class Polynomial_1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double c;
        double k;

        c = scnr.nextDouble();

        k = -(10.0 * c * c) - (3.0 * c) - 5.0;

        System.out.printf("k = %.3f When c = %.1f\n", k, c);

    }

}

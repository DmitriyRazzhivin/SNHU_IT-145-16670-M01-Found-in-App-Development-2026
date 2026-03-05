/*
A polynomial is given by  . Declare double variables u and k. Then, read u from input and compute k using the polynomial.

Ex: If the input is 3.2, then the output is:

88.200

Note:  can be computed using u * u.
 */

import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double u;
        double k;

        u = scnr.nextDouble();

        k = (7.5 * u * u) + (2.0 * u) + 5.0;

        System.out.printf("%.3f\n", k);
    }
}
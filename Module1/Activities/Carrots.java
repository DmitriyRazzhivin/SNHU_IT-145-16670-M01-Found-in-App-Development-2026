import java.util.Scanner;

public class Carrots {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int carrotsQuantity;

        carrotsQuantity = scnr.nextInt();

        System.out.println("Initial number of carrots: " + carrotsQuantity);

        carrotsQuantity /= 10;

        System.out.println("Updated number of carrots: " + carrotsQuantity);
    }
}
/*
If integer degreesCelsius is 0, output "Freezing point". Otherwise, output "Not the freezing point". End with a newline.
 */

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int degreesCelsius;

        degreesCelsius = scnr.nextInt();

        if(degreesCelsius == 0){
            System.out.println("Freezing point");
        }
        else{
            System.out.println("Not the freezing point");
        }

    }
}
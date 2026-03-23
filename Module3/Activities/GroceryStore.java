/*
Integers numMuffins and myMoney are read from input. Each muffin costs 5 dollars.

Write the following if-else statement. Within the if branch, write the following assignment and nested if-else statement:

If numMuffins is greater than or equal to 5:
Assign variable totalCost with the product of numMuffins and 5.
If totalCost is less than or equal to myMoney, then output "Muffins successfully purchased".
Otherwise, output "Not enough money to buy all".
Otherwise, output "Must purchase at least 5 muffins".
End each output with a newline.
*/

import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numMuffins;
        int myMoney;
        int totalCost;

        numMuffins = scnr.nextInt();
        myMoney = scnr.nextInt();

        if(numMuffins >= 5){
            totalCost = numMuffins * 5;
            if(totalCost <= myMoney){
                System.out.println("Muffins successfully purchased");
            }
            else{
                System.out.println("Not enough money to buy all");
            }
        }

        else{
            System.out.println("Must purchase at least 5 muffins");
        }


    }
}
/*
Integers numMangos and numPlums are read from input representing the number of mangos and the number of plums at the fruit stand, respectively. The fruit stand then receives 3 additional mangos and 5 additional plums. Write statements to update numMangos and numPlums. Then, assign integer totalFruit with the total number of mangos and plums.

Click here for example
Ex: If the input is 6 8, then the output is:
9 mangos
13 plums
22 total
 */

import java.util.Scanner;

public class FruitData {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numMangos;
        int numPlums;
        int totalFruit;

        numMangos = scnr.nextInt();
        numPlums = scnr.nextInt();

        numMangos += 3;
        numPlums += 5;
        totalFruit = numPlums + numMangos;

        System.out.println(numMangos + " mangos");
        System.out.println(numPlums + " plums");
        System.out.println(totalFruit + " total");
    }
}
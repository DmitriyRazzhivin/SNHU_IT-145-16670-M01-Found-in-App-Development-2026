package city_stats_2;
/*
Write the inputCities() method in the SmallCities class. Within inputCities(), use scnr to read pairs of inputs, string currName and integer currPopulation, until "done" is read from input. Create each City object with currName and currPopulation as arguments and append each object to ArrayList cityList.

Ex: If the input is Davids 3100 Sundance 3400 Goshen 2600 Jackson 2700 done, then the output is:

City: Davids, Population: 3100
City: Sundance, Population: 3400
City: Goshen, Population: 2600
City: Jackson, Population: 2700
 */


import java.util.Scanner;
import java.util.ArrayList;

public class CitySystem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SmallCities smallCities = new SmallCities();

        smallCities.inputCities(scnr);
        smallCities.printCities();
    }
}

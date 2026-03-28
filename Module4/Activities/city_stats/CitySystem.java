/*
The program first reads integer cityCount from input, representing the number of pairs of inputs to be read. Each pair has a string and an integer, representing the city's name and population, respectively. One City object is created for each pair and added to ArrayList cityList. Write the findAverageCityPopulation() method in the SmallCities class to return the average population of all the City objects as an integer.

Ex: If the input is:

4
Hum 3304 Goshen 3600 Worland 2900 Asaph 4200

then the output is:

Average city population: 3501

Note: The ArrayList has at least one element.
 */

package city_stats;

import java.util.Scanner;
import java.util.ArrayList;

public class CitySystem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SmallCities smallCities = new SmallCities();

        smallCities.inputCities(scnr);
        System.out.println("Average city population: " + smallCities.findAverageCityPopulation());
    }
}

package city_stats_2;

import java.util.Scanner;
import java.util.ArrayList;

public class SmallCities {
    private ArrayList<City> cityList = new ArrayList<City>();

    /* Your code goes here */
    public void inputCities(Scanner scnr){

        String currName = scnr.next();
        int currPop;

        while (!currName.equals("done")){

            currPop = scnr.nextInt();
            City currCity = new City();

            currCity.setNameAndPopulation(currName, currPop);

            cityList.add(currCity);

            currName = scnr.next();

        }

    }


    public void printCities() {
        City currCity;
        int i;

        for (i = 0; i < cityList.size(); ++i) {
            currCity = cityList.get(i);
            currCity.print();
        }
    }
}
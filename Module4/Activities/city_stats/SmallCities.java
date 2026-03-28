package city_stats;

import java.util.Scanner;
import java.util.ArrayList;

public class SmallCities {
    private ArrayList<City> cityList = new ArrayList<City>();

    public void inputCities(Scanner scnr) {
        City currCity;
        String currName;
        int currPopulation;
        int cityCount;
        int i;

        cityCount = scnr.nextInt();
        for (i = 0; i < cityCount; ++i) {
            currName = scnr.next();
            currPopulation = scnr.nextInt();
            currCity = new City();
            currCity.setNameAndPopulation(currName, currPopulation);
            cityList.add(currCity);
        }
    }

    /* Your code goes here */


    public int findAverageCityPopulation(){

        int popCount = 0;

        for (int i = 0; i< cityList.size(); ++i){

            City tempCity = cityList.get(i);
            popCount += tempCity.getPopulation();

        }

        return popCount / cityList.size();

    }

}

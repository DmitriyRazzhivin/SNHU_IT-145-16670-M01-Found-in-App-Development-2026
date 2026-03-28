package city_stats_2;

public class City {
    private String name;
    private int population;

    public void setNameAndPopulation(String newName, int newPopulation) {
        name = newName;
        population = newPopulation;
    }

    public void print() {
        System.out.println("City: " + name + ", Population: " + population);
    }
}

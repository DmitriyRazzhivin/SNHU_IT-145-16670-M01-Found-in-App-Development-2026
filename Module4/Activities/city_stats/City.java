package city_stats;

public class City {
    private String name;
    private int population;

    public void setNameAndPopulation(String newName, int newPopulation) {
        name = newName;
        population = newPopulation;
    }

    public int getPopulation() {
        return population;
    }
}

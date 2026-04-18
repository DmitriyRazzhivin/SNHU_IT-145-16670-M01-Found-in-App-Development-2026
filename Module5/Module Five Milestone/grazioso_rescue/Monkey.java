package grazioso_rescue;

public class Monkey extends RescueAnimal {
    private double tailLength;
    private double height;
    private double bodyLength;
    private String species;

//Default constructor
public Monkey(){
    super();
}

    @Override
    public String getType() {
        return this.getClass().getName();
    }

    public Monkey(String pit, String s) {
    }

    // Accessor method for tailLength
    public double getTailLength(){
        return tailLength;
    }

    // Mutator method for tailLength
    public void setTailLength(double tailLength){
        this.tailLength = tailLength;
    }

    // Accessor method for height
    public double getHeight(){
        return height;
    }

    // Mutator method for height
    public void setHeight(double height){
        this.height = height;
    }

    // Accessor method for bodyLength
    public double getBodyLength(){
        return bodyLength;
    }

    // Mutator method for bodyLength
    public void setBodyLength(double bodyLength){
        this.bodyLength = bodyLength;
    }

    // Accessor method for species
    public String getSpecies(){
        return species;
    }

    // Mutator method for species
    public void setSpecies(String species){
        this.species = species;
    }

}


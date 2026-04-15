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

//Detailed Constructor
public Monkey(String name, String animalType, String gender, String age, String weight,
              String acquisitionDate, String acquisitionCountry, String trainingStatus,
              boolean reserved, String inServiceCountry,double tailLength,
              double height, double bodyLength, String species){

    super(); // Initialize the superclass

    // Initialize inherited attributes using setters
    setName(name);
    setGender(gender);
    setAge(age);
    setWeight(weight);
    setAcquisitionDate(acquisitionDate);
    setAcquisitionLocation(acquisitionCountry);
    setTrainingStatus(trainingStatus);
    setReserved(reserved);
    setInServiceCountry(inServiceCountry);
    setAnimalType("monkey");

    // Initialize Monkey-specific attributes
    setTailLength(tailLength);
    setHeight(height);
    setBodyLength(bodyLength);
    setSpecies(species);

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


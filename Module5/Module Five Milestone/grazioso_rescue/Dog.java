package grazioso_rescue;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    public Dog() {
        super();
    }

    public Dog(String name, String breed, Gender gender, int age, double weight, LocalDate acquisitionDate, String acquisitionCountry, TrainingStatus trainingStatus, boolean reserved, String inServiceCountry) {
        super(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        this.breed = breed;
    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

    @Override
    public String getType() {
        return this.getClass().getName();
    }
}

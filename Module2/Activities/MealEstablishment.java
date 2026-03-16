/*
Define a default constructor that initializes the fields rating (integer) and owner (string) with the default values 1 and "Undefined", respectively.

Ex: If the input is 3 Avi, then the output is:

Default values:
Rating: 1, Name: Undefined's Food Truck
After mutator methods:
Rating: 3, Name: Avi's Food Truck

Note: The class's print() method is called before and after the input is passed to the setters.
 */

import java.util.Scanner;

public class MealEstablishment {
    private int rating;
    private String owner;

    public MealEstablishment(){
        rating = 1;
        owner = "Undefined";

    }

    public void setRating(int mealEstablishmentRating) {
        rating = mealEstablishmentRating;
    }

    public void setOwner(String mealEstablishmentOwner) {
        owner = mealEstablishmentOwner;
    }

    public void print() {
        System.out.println("Rating: " + rating + ", Name: " + owner + "'s Food Truck");
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int newRating;
        String newOwner;
        MealEstablishment favoriteMealEstablishment = new MealEstablishment();

        System.out.println("Default values: ");
        favoriteMealEstablishment.print();

        newRating = scnr.nextInt();
        newOwner = scnr.next();

        favoriteMealEstablishment.setRating(newRating);
        favoriteMealEstablishment.setOwner(newOwner);

        System.out.println("After mutator methods: ");
        favoriteMealEstablishment.print();
    }
}
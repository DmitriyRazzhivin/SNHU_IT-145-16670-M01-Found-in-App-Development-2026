package grazioso_rescue;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Instance variables (if needed)
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.

        Scanner scnr = new Scanner(System.in);
        String menuChoice = "";

        while (!menuChoice.equalsIgnoreCase("q")) {
            displayMenu();
            menuChoice = scnr.nextLine();

            switch (menuChoice) {
                case "1":
                    intakeNewDog(scnr);
                    break;
                case "2":
                    intakeNewMonkey(scnr);
                    break;
                case "3":
                    reserveAnimal(scnr);
                    break;
                case "4":
                    printAnimals("dog");
                    break;
                case "5":
                    printAnimals("monkey");
                    break;
                case "6":
                    printAnimals("available");
                    break;
                case "q":
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Pit","", "male", "5", "40", "06-23-2020", "Thailand", "untrained", false, "Thailand", 2.4, 4, 4, "Capuchin");
        Monkey monkey2 = new Monkey("Dana","", "female", "3", "30", "05-20-2020", "Laos", "trained: Phase I", true, "Laos", 2.1, 3.8, 3.5, "Guenon");
        Monkey monkey3 = new Monkey("Seth","", "male", "2", "25", "04-19-2020", "Cambodia", "untrained", false, "Cambodia", 1.5, 3.3, 3.3, "Macaque");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();

        System.out.println("What is the dog's gender? (male/female)");
        String gender = scanner.nextLine();

        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the acquisition date? (MM-DD-YYYY)");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the acquisition country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is this dog reserved? (true/false)");
        boolean reserved = scanner.nextBoolean();
        scanner.nextLine(); // Clear the buffer!

        System.out.println("What is the in-service country?");
        String inServiceCountry = scanner.nextLine();

        // --- Instantiate and Add ---
        // Create the Dog object using the parameters from the Dog constructor
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate,
                acquisitionCountry, trainingStatus, reserved, inServiceCountry);

        // Save to the list
        dogList.add(newDog);

        System.out.println("\nDog " + name + " added successfully!");
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();

            // Check if the monkey name already exists
            for (Monkey monkey : monkeyList) {
                if (monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }

            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();

            // Species validation
            if (!(species.equalsIgnoreCase("Capuchin") ||
                    species.equalsIgnoreCase("Guenon") ||
                    species.equalsIgnoreCase("Macaque") ||
                    species.equalsIgnoreCase("Marmoset") ||
                    species.equalsIgnoreCase("Squirrel monkey") ||
                    species.equalsIgnoreCase("Tamarin"))) {
                System.out.println("\n\nError: Species not allowed.\n\n");

                return;
            }

            System.out.println("What is the monkey's gender? (male/female)");
            String gender = scanner.nextLine();

            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();

            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();

            System.out.println("What is the acquisition date? (MM-DD-YYYY)");
            String acquisitionDate = scanner.nextLine();

            System.out.println("What is the acquisition country?");
            String acquisitionCountry = scanner.nextLine();

            System.out.println("What is the training status?");
            String trainingStatus = scanner.nextLine();

            System.out.println("Is this monkey reserved? (true/false)");
            boolean reserved = scanner.nextBoolean();
            scanner.nextLine(); // Clear the newline buffer after nextBoolean()

            System.out.println("What is the in-service country?");
            String inServiceCountry = scanner.nextLine();

            System.out.println("What is the tail length?");
            double tailLength = Double.parseDouble(scanner.nextLine());

            System.out.println("What is the height?");
            double height = Double.parseDouble(scanner.nextLine());

            System.out.println("What is the body length?");
            double bodyLength = Double.parseDouble(scanner.nextLine());

            // Instantiate and Add to List
            // Creating the new Monkey object using all gathered variables
            Monkey newMonkey = new Monkey(name, "monkey", gender, age, weight,
                    acquisitionDate, acquisitionCountry, trainingStatus,
                    reserved, inServiceCountry, tailLength, height,
                    bodyLength, species);

            // Adding to the global monkeyList
            monkeyList.add(newMonkey);
            System.out.println("\nMonkey " + name + " added successfully!");

        }
        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("What animal type are you looking for?");
            String type = scanner.nextLine();
            System.out.println(" In which in service country do you need the animal?");
            String inServiceCountry = scanner.nextLine();
            boolean found = false;

            if (type.equalsIgnoreCase("dog")){
                for (Dog dog: dogList) {
                    if(dog.getInServiceCountry().equalsIgnoreCase(inServiceCountry) &&
                        dog.getTrainingStatus().equalsIgnoreCase("in service") &&
                                !dog.getReserved() ){
                        //Marking the dog "reserved"
                        dog.setReserved(true);

                        // Message the user of success
                        System.out.println("Animal " + dog.getName() + " has been reserved.");

                        //Stop the loop
                        found = true;
                        return;
                        }
                    }
                }

            else if(type.equalsIgnoreCase("monkey")){
                for (Monkey monkey: monkeyList){
                    if(monkey.getInServiceCountry().equalsIgnoreCase(inServiceCountry)
                        && monkey.getTrainingStatus().equalsIgnoreCase("in service")
                        && !monkey.getReserved()){

                        monkey.setReserved(true);
                        // Message the user of success
                        System.out.println("Animal " + monkey.getName() + " has been reserved.");

                        //Stop the loop
                        found = true;
                        return;
                    }

                }

            }
            if (!found) {
                System.out.println("The entered animal was not found, or is not in service and available in that country.");
            }
        }


        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String listType) {
            //System.out.println("The method printAnimals needs to be implemented");
            // Option 4: Print Dogs
            if (listType.equalsIgnoreCase("dog")) {
                System.out.println("\n--- List of Dogs ---");
                for (Dog dog : dogList) {
                    System.out.println("Name: " + dog.getName() +
                            " | Status: " + dog.getTrainingStatus() +
                            " | Country: " + dog.getAcquisitionLocation() +
                            " | Reserved: " + dog.getReserved());
                }
            }

            // Option 5: Print Monkeys
            else if (listType.equalsIgnoreCase("monkey")) {
                System.out.println("\n--- List of Monkeys ---");
                for (Monkey monkey : monkeyList) {
                    System.out.println("Name: " + monkey.getName() +
                            " | Status: " + monkey.getTrainingStatus() +
                            " | Country: " + monkey.getAcquisitionLocation() +
                            " | Reserved: " + monkey.getReserved());
                }
            }

            // Option 6: Print Available (Fully trained AND not reserved)
            else if (listType.equalsIgnoreCase("available")) {
                System.out.println("\n--- Available Animals (In Service & Not Reserved) ---");

                // Check dogs
                for (Dog dog : dogList) {
                    if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                        System.out.println("Type: Dog | Name: " + dog.getName() + " | Location: " + dog.getInServiceCountry());
                    }
                }

                // Check monkeys
                for (Monkey monkey : monkeyList) {
                    if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                        System.out.println("Type: Monkey | Name: " + monkey.getName() + " | Location: " + monkey.getInServiceCountry());
                    }
                }
            }

        }

}


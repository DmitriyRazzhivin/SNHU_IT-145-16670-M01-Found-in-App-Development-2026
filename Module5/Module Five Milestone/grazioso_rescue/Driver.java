package grazioso_rescue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Driver {

    private static List<Dog> dogList;
    // Instance variables (if needed)
    private static List<Monkey> monkeyList;

    private static Map<String, List<? extends  RescueAnimal>> allAnimals = new HashMap<>();

    public static void main(String[] args) {

        dogList = initializeDogList();
        allAnimals.put("DOGS", dogList);

        monkeyList = initializeMonkeyList();
        allAnimals.put("MONKEYS", monkeyList);

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.

        Scanner scnr = new Scanner(System.in);
        String menuChoice = "";

        while (!menuChoice.equalsIgnoreCase("q")) {
            displayMenu();
            menuChoice = scnr.nextLine().trim().toLowerCase(); // Use trim and toLowerCase for inout validation

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
        scnr.close(); // Closing scanner

    }

    //Helper method to get a valid double from the user
    public static double getValidDouble(Scanner scanner, String prompt){
        double value = -1;
        while(true){
            try {
                System.out.println(prompt);
                String input = scanner.nextLine().trim();
                value = Double.parseDouble(input);
                if(value >= 0) {
                    return value;
                }else {
                    System.out.println("Value must be a positive number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value");
            }
            }
        }

    //Helper method to get a valid double from the user
    public static int getValidInt(Scanner scanner, String prompt){
        int value = -1;
        while(true){
            try {
                System.out.println(prompt);
                String input = scanner.nextLine().trim();
                value = Integer.parseInt(input);
                if(value >= 0) {
                    return value;
                }else {
                    System.out.println("Value must be a positive number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value");
            }
        }
    }

    //Helper method to get a valid String from user(not empty)
    public static String getValidString(Scanner scanner, String prompt){
        String input = "";
        while (input.isEmpty()) {
            input = scanner.nextLine().trim();
            System.out.println(prompt);
            if(input.isEmpty()){
                System.out.println("This field cannot be empty. Please try again.");
            }
        }
        return input;
    }

    //helper method that validates a number but returns it as a String
    public static String getValidNumericString(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                String input = scanner.nextLine().trim();
                // Test if it's a valid number
                Double.parseDouble(input);
                // If the parse succeeds, return the original string
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value (e.g., 25.5).");
            }
        }
    }
    // Helper method to safely get a boolean value from the user
    public static boolean getValidBoolean(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("true")) {
                return true;
            } else if (input.equals("false")) {
                return false;
            } else {
                // Clear feedback for the user
                System.out.println("Invalid input. Please type exactly 'true' or 'false'.");
            }
        }
    }

    // Helper method to validate monkey species
    public static String getValidMonkeySpecies(Scanner scanner) {
        String species = "";
        boolean validSpecies = false;

        while (!validSpecies) {
            System.out.println("Enter species:");
            System.out.println("(Capuchin, Guenon, Macaque, Marmoset, Squirrel Monkey, Tamarin)");
            species = scanner.nextLine().trim();

            // Check if species matches approved list
            if (species.equalsIgnoreCase("Capuchin") ||
                    species.equalsIgnoreCase("Guenon") ||
                    species.equalsIgnoreCase("Macaque") ||
                    species.equalsIgnoreCase("Marmoset") ||
                    species.equalsIgnoreCase("Squirrel Monkey") ||
                    species.equalsIgnoreCase("Tamarin")) {
                validSpecies = true;
            } else {
                System.out.println("Invalid species. Please enter one from the list.");
            }
        }
        return species;
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
    public static List<Dog> initializeDogList() {
        dogList = new ArrayList<>();

        Dog dog1 = new Dog("Spot", "German Shepherd", Gender.MALE, 1, 25.6, LocalDate.of(2019, 5, 12), "United States", TrainingStatus.WILD, false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", Gender.MALE, 3, 35.2, LocalDate.of(2019, 5, 12), "United States", TrainingStatus.NEWBY, false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", Gender.FEMALE, 4, 25.6, LocalDate.of(2019, 5, 12), "Canada", TrainingStatus.TRAINED_L1, true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);

        return dogList;
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static List<Monkey> initializeMonkeyList() {
        monkeyList = new ArrayList<>();
        Monkey monkey1 = new Monkey("Pit","", "male", "5", "40", "06-23-2020", "Thailand", "untrained", false, "Thailand", 2.4, 4, 4, "Capuchin");
        Monkey monkey2 = new Monkey("Dana","", "female", "3", "30", "05-20-2020", "Laos", "trained: Phase I", true, "Laos", 2.1, 3.8, 3.5, "Guenon");
        Monkey monkey3 = new Monkey("Seth","", "male", "2", "25", "04-19-2020", "Cambodia", "untrained", false, "Cambodia", 1.5, 3.3, 3.3, "Macaque");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);

        return monkeyList;

    }


    public static void intakeNewDog(Scanner scanner) {
        Dog newDog = new Dog();

        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        newDog.setName(name);

        String breed = getValidString(scanner, "What is the dog's breed?");
        newDog.setBreed(breed);

        String gender = getValidString(scanner,"What is the dog's gender? (male/female)");
        newDog.setGender(gender);

        int age = getValidInt(scanner,"What is the dog's age?");
        newDog.setAge(age);

        String weight = getValidString(scanner, "What is the dog's weight?");
        newDog.setWeight(weight);

        String acquisitionDate = getValidString(scanner, "What is the acquisition date? (MM-DD-YYYY)");
        newDog.setAcquisitionDate(acquisitionDate);

        String acquisitionCountry = getValidString(scanner,"What is the acquisition country?");
        newDog.setAcquisitionCountry(acquisitionCountry);

        String trainingStatus = getValidString(scanner, "What is the training status?");
        newDog.setTrainingStatus(trainingStatus);

        boolean reserved = getValidBoolean(scanner, "Is this dog reserved? (true/false)");
        newDog.setReserved(reserved);

        String inServiceCountry = getValidString(scanner, "What is the in-service country?");
        newDog.setInServiceCountry(inServiceCountry);

        // Save to the list
        dogList.add(newDog);

        System.out.println("\nDog " + name + " added successfully!");
    }



	//Instantiate and add the new monkey to the appropriate list

        public static void intakeNewMonkey(Scanner scanner) {

            String name = getValidString(scanner, "What is the monkey's name?");

            // Check if the monkey name already exists
            for (Monkey monkey : monkeyList) {
                if (monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }

            // Species validation
            String species = getValidMonkeySpecies(scanner);

            String gender = getValidString(scanner, "What is the monkey's gender? (male/female)");

            String age = getValidNumericString(scanner, "What is the monkey's age?");

            String weight = getValidNumericString(scanner, "What is the monkey's weight?");

            String acquisitionDate = getValidString(scanner, "What is the acquisition date? (MM-DD-YYYY)");

            String acquisitionCountry =getValidString(scanner, "What is the acquisition country?");

            String trainingStatus = getValidString(scanner, "What is the training status?");

            // Validation for boolean type variable "reserved"
            boolean reserved = getValidBoolean(scanner,"Is this monkey reserved? (true/false)");

            String inServiceCountry = getValidString(scanner, "What is the in-service country?");

            double tailLength = getValidDouble(scanner, "What is the tail length?");

            double height = getValidDouble(scanner, "What is the height?");

            double bodyLength = getValidDouble(scanner, "What is the body length?");

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
            List<? extends RescueAnimal> animals = listType.equals("dog") ? dogList : monkeyList;

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


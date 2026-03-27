public class Pet {

    // Private atributes
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;

    //Constructor - Initialization of Pet Object
    public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue){
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }

    //Setting up Getters and Setters

    //Getter for requesting pet type
    public String getPetType(){
        return petType;
    }
    //Setter to set pet type
    public void setPetType(String petType){
        this.petType = petType;
    }

    //Getter for Pet Name
    public String getPetName(){
        return petName;
    }
    //Setter for Pet Name
    public void setPetName(String petName){
        this.petName = petName;
    }

    // Getter for Pet Age
    public int getPetAge(){
        return petAge;
    }
    // Setter for Pet Age
    public void setPetAge(int petAge){
        this.petAge = petAge;
    }

    //Getter for Dog Spaces
    public int getDogSpaces(){
        return dogSpaces;
    }
    //Setter for Dog Spaces
    public void setDogSpaces(int dogSpaces){
        this.dogSpaces = dogSpaces;
    }

    //Getter for Cat Spaces
    public int getCatSpaces(){
        return catSpaces;
    }
    //Setter for Cat Spaces
    public void setCatSpaces(int catSpaces){
        this.catSpaces = catSpaces;
    }

    //Getter for Days Stay
    public int getDaysStay(){
        return  daysStay;
    }
    //Setter for Days Stay
    public void setDaysStay(int daysStay){
        this.daysStay =daysStay;
    }

    //Getter for Amount Due
    public double getAmountDue(){
        return amountDue;
    }
    //Setter for Amount Due
    public void setAmountDue(double amountDue){
        this.amountDue = amountDue;
    }

}

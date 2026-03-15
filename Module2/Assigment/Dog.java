public class Dog {

    // Private attributes
    private int dogSpaceNumber;
    private double dogWeight;
    private String grooming;

    // Constructor - Initialization of the Dog Object
    public Dog(int dogSpaceNumber, double dogWeight, String grooming){
        this.dogSpaceNumber = dogSpaceNumber;
        this.dogWeight = dogWeight;
        this.grooming = grooming;
    }

    // Accessor (Getter) for dogSpaceNumber
    public int getDogSpaceNumber(){
        return dogSpaceNumber;
    }

    // Mutator (Setter) for dogSpaceNumber
    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }

    // Accessor (Getter) for dogWeight
    public double getDogWeight(){
        return dogWeight;
    }

    // Mutator (Setter) for dogWeight
    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    // Accessor (Getter) for groomin
    public String getGrooming(){
        return  grooming;
    }

    // Mutator (Setter) for groomin
    public void setGrooming(String grooming) {
        this.grooming = grooming;
    }

    public static void main(String[] args){

    }
}

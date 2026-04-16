import java.util.Scanner;

public class ParseStrings {
    public static void main(String[] args) {

        String userInput = "";
        String firstWord = "";
        String secondWord = "";

        Scanner scnr = new Scanner(System.in);
        int index;



        while(true){

            System.out.print("Enter input string: \n");

            if(!scnr.hasNextLine()){
                break;
            }
            userInput = scnr.nextLine();

            if(userInput.equals("q")){
                break;
            }


            if(!userInput.contains(",")){
                System.out.println("Error: No comma in string");
            }
            else{
                index = userInput.indexOf(",");
                firstWord = userInput.substring(0, index);
                secondWord = userInput.substring(index + 1);
                System.out.println("First word: " + firstWord.trim() + "\nSecond word: " + secondWord.trim());
                System.out.println("\n");
            }
        }

        return;
    }
}
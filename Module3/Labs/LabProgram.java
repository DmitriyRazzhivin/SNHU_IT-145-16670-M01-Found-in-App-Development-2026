/*
Given a line of text as input, output the number of characters excluding spaces, periods, exclamation points, or commas.

Ex: If the input is:

Listen, Mr. Jones, calm down.
the output is:

21
Note: Account for all characters that aren't spaces, periods, exclamation points, or commas (Ex: "r", "2", "?").
 */
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userText;
        // Add more variables as needed
        int charCount = 0;
        userText = scnr.nextLine();  // Gets entire line, including spaces.

        /* Type your code here. */
        for(int i =0; i < userText.length(); i++){
            if (userText.charAt(i) != ' ' && userText.charAt(i) != '.' && userText.charAt(i) != '!' && userText.charAt(i) != ','){
                charCount += 1;
            }

        }
        System.out.println(charCount);
    }
}

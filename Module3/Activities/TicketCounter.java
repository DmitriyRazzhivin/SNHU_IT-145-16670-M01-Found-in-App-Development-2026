/*
Write an if-else statement for the following:

If userTickets is not equal to 7, execute awardPoints = 10. Else, execute awardPoints = userTickets.

Ex: If userTickets is 14, then awardPoints = 10.
 */
import java.util.Scanner;

public class TicketCounter {
    public static void main (String [] args) {
        int awardPoints;
        int userTickets;

        Scanner scnr = new Scanner(System.in);
        userTickets = scnr.nextInt(); // Program will be tested with values: 5, 6, 7, 8.

        if (userTickets != 7){
            awardPoints = 10;
        }
        else{
            awardPoints = userTickets;
        }
        System.out.println(awardPoints);
    }
}

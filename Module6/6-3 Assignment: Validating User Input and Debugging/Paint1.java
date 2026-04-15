import java.util.InputMismatchException;
import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;

        // Prompt user to input wall's height

        // Loop continues until a valid, positive wall height is entered
            do {
                try {
                    System.out.println("Enter wall height (feet): ");
                    wallHeight = scnr.nextDouble();
                }
                catch (InputMismatchException e){
                    System.out.println("Invalid input");
                    scnr.next();
                    wallHeight = 0;
                }
            } while (wallHeight <= 0);

        // Prompt user to input wall's width
        // Loop continues until a valid, positive wall width is entered
            do {
                try {
                    System.out.println("Enter wall width (feet): ");
                    wallWidth = scnr.nextDouble();
                }
                catch (InputMismatchException e){
                    System.out.println("Invalid input");
                    scnr.next();
                    wallWidth = 0;
                }
            } while (wallWidth <= 0);




        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

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
        System.out.println("Wall area:  " + wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer

        //Use Math.ceil to round up to the nearest whole can to ensure full coverage
        cansNeeded = Math.ceil(gallonsPaintNeeded);
        String can  = "";
        if(cansNeeded > 1.0){
            can = "cans";
        }
        else {
            can = "can";
        }
        System.out.println("Cans needed: " + cansNeeded + " " + can);

    }
}

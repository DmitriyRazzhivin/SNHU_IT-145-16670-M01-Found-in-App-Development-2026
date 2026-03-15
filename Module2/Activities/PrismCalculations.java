/*
Define the following methods:

calculateBaseArea() has two double parameters as a prism's base length and base width. The method returns the area of the prism's base as a double. The area of the base is calculated by:

calculateVolume() has three double parameters as a prism's base length, base width, and height. The method returns the prism's volume as a double, and uses the calculateBaseArea() method to calculate the prism's base area. The volume is calculated by:

Click here for example
Ex: If the input is 4.0 2.0 3.0, then the output is:
Base length: 4.0
Base width: 2.0
Height: 3.0
Base area: 8.0
Volume: 24.0
 */

import java.util.Scanner;

public class PrismCalculations {

    public static double calculateBaseArea(double baseLength, double baseWidth){

        return baseLength * baseWidth;

    }

    public static double calculateVolume (double baseLength, double baseWidth, double height){

        double area = calculateBaseArea(baseLength, baseWidth);
        return area * height;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userBaseLength;
        double userBaseWidth;
        double userHeight;

        userBaseLength = scan.nextDouble();
        userBaseWidth = scan.nextDouble();
        userHeight = scan.nextDouble();

        System.out.println("Base length: " + userBaseLength);
        System.out.println("Base width: " + userBaseWidth);
        System.out.println("Height: " + userHeight);
        System.out.printf("Base area: %.1f\n", calculateBaseArea(userBaseLength, userBaseWidth));
        System.out.printf("Volume: ");
        System.out.printf("%.1f\n", calculateVolume(userBaseLength, userBaseWidth, userHeight));
    }
}
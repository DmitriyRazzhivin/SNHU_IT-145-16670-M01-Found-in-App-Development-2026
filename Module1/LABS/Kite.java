/*
Logic errors can be subtle and difficult to detect. While syntax errors prompt the compiler to generate error messages that hint at what or where the issue might be, logic errors often don't produce any errors and can go unnoticed in the program. Programs with logic errors may compile and run, but the resultant output may be unexpected or incorrect.

This program calculates the perimeter of a rectangular kite. However, the mathematical formula for the perimeter is incorrect. Fix this logic error so the perimeter of a rectangular kite is properly calculated.

The correct output of the program is:

Sides: 12 10
Perimeter: 44
End the last output with a newline.
 */

public class Kite {
    public static void main(String[] args) {
        int longSide = 12;
        int shortSide = 10;
        int perimeter;

        perimeter = 2 * (longSide + shortSide);

        System.out.println("Sides: " + longSide + " " + shortSide);
        System.out.println("Perimeter: " + perimeter);
    }
}

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int rectangleLength;
        int rectangleWidth;

        rectangleLength = scnr.nextInt();
        rectangleWidth = scnr.nextInt();

        System.out.println(rectangleLength * rectangleWidth);

    }
}
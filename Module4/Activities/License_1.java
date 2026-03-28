import java.util.Scanner;
public class License_1 {
    private char group;
    private String state;

    public void readGroupAndState(Scanner scnr) {
        group = scnr.next().charAt(0);
        state = scnr.next();
    }

    public void print() {
        System.out.println("License group: " + group + ", State: " + state);
    }
}
/*
Use scnr to read integer rowNumber from input until the next rowNumber read is equal to -1. If rowNumber is not equal to -1:

Assign currLicense with a new License object.
Use currLicense's readGroupAndState() method to read the license's group and state from input.
Append currLicense to ArrayList licenseList.
Ex: If the input is:

1 C LA
2 A NJ
3 B VA
-1

then the output is:

License group: C, State: LA
License group: A, State: NJ
License group: B, State: VA
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Licenses_1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<License_1> licenseList = new ArrayList<>();
        License_1 currLicense;
        int rowNumber;
        int i;

        /* Your code goes here */
        rowNumber = scnr.nextInt();

        while (rowNumber != -1){

            currLicense = new License_1();
            currLicense.readGroupAndState(scnr);

            licenseList.add(currLicense);
            rowNumber = scnr.nextInt();

        }

        for (i = 0; i < licenseList.size(); ++i) {
            currLicense = licenseList.get(i);
            currLicense.print();
        }
    }
}
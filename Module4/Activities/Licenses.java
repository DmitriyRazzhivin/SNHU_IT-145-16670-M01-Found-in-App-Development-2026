/*
The program first reads integer licenseCount from input, representing the number of pairs of inputs to be read. Each pair has a string and an integer, representing the license's state and fee, respectively. One License object is created for each pair and added to ArrayList licenseList. Output "Average license fee: ", followed by the average fee of all the License objects as an integer. End with a newline.

Ex: If the input is:

3
WV 198 MN 185 UT 160

then the output is:

Average license fee: 181

Note: The ArrayList has at least one element.
 */

import java.util.Scanner;
import java.util.ArrayList;



public class Licenses {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<License> licenseList = new ArrayList<License>();
        License currLicense;
        String currState;
        int currFee;
        int sumFee;
        int licenseCount;
        int i;

        licenseCount = scnr.nextInt();
        for (i = 0; i < licenseCount; ++i) {
            currState = scnr.next();
            currFee = scnr.nextInt();

            currLicense = new License();
            currLicense.setDetails(currState, currFee);
            licenseList.add(currLicense);
        }

        sumFee = 0;

        for(i = 0; i < licenseList.size(); ++i){

            currLicense = licenseList.get(i);

            sumFee += currLicense.getFee();
        }

        System.out.println("Average license fee: " + (sumFee / licenseCount));

    }
}
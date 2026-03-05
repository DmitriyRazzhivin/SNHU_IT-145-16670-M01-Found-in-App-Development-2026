/*
The intensity of a sound wave is given by . Read double variables soundPower and distanceTraveled from input, respectively. Then, compute soundIntensity using the formula. Finally, output "Sound wave intensity is " followed by the value of soundIntensity to five digits after the decimal point. End with a newline.

Ex: If the input is 12.0 11.0, then the output is:

Sound wave intensity is 0.00789

Note:

Use the constant Math.PI for .
 can be computed using *.
printf() can be used with "%.5f" to output a double to 5 digits after the decimal point.
*/


import java.util.Scanner;

public class SoundIntensity {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        double soundPower;
        double distanceTraveled;
        double soundIntensity;

        soundPower = scnr.nextDouble();
        distanceTraveled = scnr.nextDouble();

        soundIntensity = soundPower / (4.0 * Math.PI * distanceTraveled * distanceTraveled);

        System.out.printf("Sound wave intensity is %.5f\n", soundIntensity);


    }
}

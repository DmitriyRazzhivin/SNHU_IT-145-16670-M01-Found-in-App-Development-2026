/*
The goal of this lab is to help students identify some of the syntax errors commonly made while writing a program. Syntax errors are detected by the compiler during compilation, and error messages are generated to describe the errors encountered.

The program in the default template is expected to produce the following output when the input is 15:

The Dodgers scored 15
However, syntax errors presented in the code prevent the program from being compiled.



(1) Click the Run button to run the program and examine the output. Compiler errors will be displayed instead of the program output:

Baseball.java:3: error: ';' expected
      int dodgers
                 ^
Baseball.java:8: error: unclosed string literal
      System.out.println("The Dodgers scored + dodgers);
                         ^

Error messages are often long and technical. Do not expect the messages to make much sense when starting to learn a programming language. Use the messages as hints to locate the portion of the program that causes an error. An error message usually begins with the location where an error is detected in the program.

The first error in the error message indicates that an error appears in line 3 of Baseball.java (Baseball.java:3:). The compiler expects the statements to be terminated properly; in other words, the line is missing a semi-colon (;).

The second error in the error message indicates that an error appears in line 8 of Baseball.java (Baseball.java:8:). The compiler expects the string literal to have an ending quotation mark (") before the plus sign.



(2) Correct the line termination error in line 3 and unclosed string error in line 8, then run the program again. Notice that a different list of errors is displayed; however, the errors about improperly terminated lines are removed. Therefore, the fix applied in this step is correct.

More errors are detected in this step because the compiler treats line 5 as an independent statement, and one error often causes additional errors further along in the program. Notice that the new errors are all located in line 5.

To proceed with the troubleshooting, examine the errors displayed:

Baseball.java:5: error: cannot find symbol
      Scanner scnr = new Scanner(System.in);
      ^
  symbol:   class Scanner
  location: class Baseball
Baseball.java:5: error: cannot find symbol
      Scanner scnr = new Scanner(System.in);
                         ^
  symbol:   class Scanner
  location: class Baseball
The error messages indicate that the Scanner symbol is not found. The Scanner class must be imported before the class definition.



(3) Correct the import error and run the program again. The program compiles successfully and produces the following output:

The Dodgers scored 15


(4) Click the Submit for grading button. The submitted program has passed all the tests and a total score of 5/5 is awarded.
 */

import java.util.Scanner;

public class Baseball {
    public static void main(String[] args) {
        int dodgers;

        Scanner scnr = new Scanner(System.in);
        dodgers = scnr.nextInt();

        System.out.println("The Dodgers scored "  + dodgers);
    }
}

/*
The Member class has a no-arg constructor, a constructor with one parameter, and a constructor with three parameters. Declare the following objects:

member1 with no arguments
member2 with memberName as an argument
member3 with memberName, memberAge, and memberHeight as arguments
Ex: If the input is Ina 29 5.00, then the output is:
Member: Unspecified, 0, 0.00
Member: Ina, 0, 0.00
Member: Ina, 29, 5.00
 */

import java.util.Scanner;

public class Member {
    private String name;
    private int age;
    private double height;

    public Member() { // No-arg constructor
        name = "Unspecified";
        age = 0;
        height = 0.0;
    }

    public Member(String memberName) {
        name = memberName;
        age = 0;
        height = 0.0;
    }

    public Member(String memberName, int memberAge, double memberHeight) {
        name = memberName;
        age = memberAge;
        height = memberHeight;
    }

    public void print() {
        System.out.printf("Member: %s, %d, %.2f\n", name, age, height);
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String memberName;
        int memberAge;
        double memberHeight;

        memberName = scnr.next();
        memberAge = scnr.nextInt();
        memberHeight = scnr.nextDouble();

        Member member1 = new Member();
        Member member2 = new Member(memberName);
        Member member3 = new Member(memberName, memberAge, memberHeight);

        member1.print();
        member2.print();
        member3.print();
    }
}
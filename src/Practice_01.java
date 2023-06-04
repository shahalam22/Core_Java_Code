import java.util.Scanner;

/*

1. Write a program to sum three numbers in Java.
2. Write a program to calculate CGPA using marks of three subjects (out of 100)
3. Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
4. Write a Java program to convert Kilometers to miles.
5. Write a Java program to detect whether a number entered by the user is an integer or not.

 */

public class Practice_01 {
    public static void main(String[] args) {
        //sum of three numbers
        int a = 5, b = 6, c = 7;
        int d = a+b+c;
        System.out.println("Sum of three number is - " + d);

        //calculate CGPA
        float sub1 = 45.58f;
        float sub2 = 48.86f;
        float sub3 = 95.25f;
        float cgpa = (sub1 + sub2 + sub3)/30;
        System.out.println("Cgpa is - " + cgpa);

        //greeting
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Hello " + name + ", have a good day!");

        //kilo to miles
        System.out.println("Enter kilometer - ");
        float kilo = input.nextFloat();
        float mile = kilo*0.6214f;
        System.out.println(kilo + " kilometer is equal to " + mile + " miles");

        //Integer or not
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}

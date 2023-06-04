import java.util.Scanner;

public class Practice_03 {
    public static void main(String[] args) {
        //Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Subject 1 number : ");
        float sub1 = input.nextFloat();
        System.out.println("Enter Subject 2 number : ");
        float sub2 = input.nextFloat();
        System.out.println("Enter Subject 3 number : ");
        float sub3 = input.nextFloat();

        float total = (sub1 + sub2 + sub3)/3;
        if(total>=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("Congratulations! You have passed.");
        } else {
            System.out.println("Sorry! you have failed.");
        }

        /*Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:
            Income Slab	Tax
            2.5L – 5.0L  	5%
            5.0L – 10.0L 	20%
            Above 10.0L	30%
        */

        System.out.println("Please! enter your salary [in lac] - ");
        float salary = input.nextFloat();
        if(salary>=2.5 && salary<=5.0){
            System.out.println("You're tax is - " + ((salary*5)/100));
        } else if(salary>5.0 && salary<=10.0){
            System.out.println("You're tax is - " + ((salary*20)/100));
        } else {
            System.out.println("You're tax is - " + ((salary*30)/100));
        }

        //Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]
        System.out.println("Enter days number - ");
        int day = input.nextInt();
        switch (day) {
            case 1 -> System.out.println("It's Friday");
            case 2 -> System.out.println("It's Saturday");
            case 3 -> System.out.println("It's Sunday");
            case 4 -> System.out.println("It's Monday");
            case 5 -> System.out.println("It's Tuesday");
            case 6 -> System.out.println("It's Wednesday");
            case 7 -> System.out.println("It's Thursday");
            default -> System.out.println("Enter a valid number!");
        }
    }
}

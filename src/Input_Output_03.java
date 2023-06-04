import java.util.Scanner;

public class Input_Output_03 {
    public static void main(String[] args) {
        //to take input we have to import scanner class and make an instance of it
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Name, Roll, Marks, Grade : ");

        String name = input.nextLine();
        int roll = input.nextInt();
        double marks = input.nextDouble();
        char grade = input.next().charAt(0);    //we will take character of 0th index from input stream

        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade);

        input.close();
    }
}

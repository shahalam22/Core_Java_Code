public class Method_15 {

    //creating java method
    /*Syntax :
        access_modifier  static/non-static  return_type  method_name (parameter1, parameter2,...) {
            code...
            code...
            code...
            return value
        }
    */

    //method 1
    public static void welcome(String name, int roll){
        System.out.println("Welcome " + name);
        System.out.println("Your roll no is - " + roll);
    }
    //method 2
    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }
    //method 3
    public static void methodLoop(int marks){
        if(marks<40){
            System.out.println("You failed!");
        } else if (marks>=40 && marks<=59) {
            System.out.println("You got C.");
        } else if (marks>=60 && marks<=80) {
            System.out.println("You got B.");
        } else {
            System.out.println("You got A.");
        }

    }

    public static void main(String[] args) {

        welcome("Abir", 39);

        System.out.println("Sum of number is : " + sum(5, 6));

        methodLoop(25);
        methodLoop(54);
        methodLoop(72);
        methodLoop(87);
    }
}

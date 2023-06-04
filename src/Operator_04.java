public class Operator_04 {
    public static void main(String[] args) {
        //Arithmetical operator
        int a = 10, b = 5;
        //addition : +
        System.out.println("addition is : "+(a+b));
        //subtraction : -
        System.out.println("subtraction is : "+(a-b));
        //multiplication : *
        System.out.println("multiplication is : "+(a*b));
        //division : /
        System.out.println("division is : "+(a/b));
        //modulus : % [will give remainder]
        System.out.println("modulus is : "+(a%b));
        //increment : ++
        System.out.println("increment is : "+(++a));
        //decrement : --
        System.out.println("decrement is : "+(--a));

        //Assignment operator
        /*
        assignment : =
        addition assignment : +=
        subtraction assignment : -=
        multiplication assignment : *=
        division assignment : /=
        bitwise and operation assignment : &=
        bitwise or operation assignment : |=
        bitwise Xor operation assignment : ^=
        leftshift assignment : >>=
        rightshift assignment : >>=
         */

        //comparison operator
        /*
        equal : ==
        not equal : !=
        less than : <
        greater than : >
        less than or equal to : <=
        greater than or equal to : >=
         */

        //logical operator
        /*
         and operator : &&
         or operator : ||
         */

        //instance of operator

        Integer num = 9;
        if(num instanceof Integer){
            System.out.println("num is an object of Integer wrapper class.");
        }else {
            System.out.println("num is not an object of Integer wrapper class");
        }   //wrapper class : class of primitive data types by which we can create object of primitive data types.

        //conditional operator

        Integer number = 0;
        String res;
        res = (number>5) ? "number is greater than 5." : "number is less than 5.";
        System.out.println(res);
    }
}

//variable -- 1. Local, 2. Instance, 3. Class/Static

public class Variable_02 {
    //here, a & b is the instance variable we can access it from outside. As main is static and these are not static so we can't access these from main. But we can access these from other non-static methods
    public int a = 33;
    public int b = 87;
    public void printab(){
        System.out.println(a+" & "+b);
    }
    //here, e & f is the static[global ek sense e] variable we can access it from outside.
    public static int e = 5;
    public static int f = 6;

    public static void main(String[] args) {
        //here, c & d is the local variable of variable class we can't access it from outside
        int c = 9;
        int d = 12;
        System.out.println(c+" & "+d);
        System.out.println(e+" & "+f);
    }
}

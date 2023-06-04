public class Method_overloading_16 {

    //method 1
    public static void sum(int a, int b){
        System.out.println("--method 1--");
        System.out.println("sum is - " + (a+b));
    }

    public static void sum(double a, double b){
        System.out.println("--method 2--");
        System.out.println("sum is - " + (a+b));
    }

    public static void main(String[] args) {
        //method 1 will be called
        sum(45, 55);
        //method 2 will be called
        sum(24.5, 55.27);

        sum(25, 25.258);    //as one input is double so will convert all other values into bigger data types & will call method 2.
    }
}

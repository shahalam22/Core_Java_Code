public class Switch_07 {
    public static void main(String[] args) {
        //example 1
        System.out.println("Example 1 --");
        int a = 3;
        switch (a){
            case 1 :
                System.out.println("This is one.");
                break;
            case 2 :
                System.out.println("This is two.");
                break;
            case 3 :
                System.out.println("This is three.");
                break;
            default:
                System.out.println("Invalid digit");
                break;
        }

        //example 2
        System.out.println("Example 2 -- ");
        //if we don't put break in any of the statement then it will execute every scope till it reaches any break
        int b = 2;
        switch (b){
            case 1 :
                System.out.println("this is one.");
            case 2 :
                System.out.println("this is two.");
            case 3 :
                System.out.println("this is three");
                break;
            default:
                System.out.println("invalid entry.");
                break;
        }
    }
}

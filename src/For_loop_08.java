public class For_loop_08 {
    public static void main(String[] args) {
        /* syntax
         for(initialization; condition; modification){
            code....
            code....
            code....
         }
        */

        //example 1
        System.out.println("Example 1 -- Normal loop [increment]");
        for(int i=1; i<=10; i++){
            System.out.println("It is "+i);
        }

        System.out.println("Example 1 -- Normal loop [decrement]");
        for(int i=10; i>=0; i--){
            System.out.println("It is "+i);
        }

        //example 2
        System.out.println("Example 2 -- nested loop");
        for(int i=1; i<3; i++){
            for(int j=1; j<=10; j++){
                System.out.println(i+" x "+j+" = "+i*j);
            }
        }
    }
}

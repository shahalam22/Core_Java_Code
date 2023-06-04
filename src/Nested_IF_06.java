public class Nested_IF_06 {
    public static void main(String[] args) {
        int a = 13;
        if(a>0){
            System.out.println("greater than 0.");
            if(a>100){
                System.out.println("also greater than 100.");
            } else if(a<100){
                System.out.println("also less than 100.");
            } else {
                System.out.println("equal to 100.");
            }
        } else if (a<0) {
            System.out.println("less than 0.");
        } else {
            System.out.println("equal to 0.");
        }
    }
}

public class Break_Continue_12 {
    public static void main(String[] args) {
        //break - it ends the loop before loop reached it's end.
        System.out.println("Break statement --");
        for(int i=1; i<=10; i++){
            System.out.println("This is "+i);
            if(i==6){
                break;
            }
        }

        System.out.println();

        //continue - it skips that iteration when it matches condition in the loop
        System.out.println("Continue statement --");
        for(int i=1; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.println("This is "+i);
        }
    }
}

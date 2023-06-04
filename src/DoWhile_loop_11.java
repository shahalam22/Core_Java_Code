public class DoWhile_loop_11 {
    public static void main(String[] args) {
        /*syntax [this is different because the body of the do part executes atleast once as condition remains last. it runs once then checks condition then works as normal loops.]
            declaration+initialization;
            do{
                code...
                code...
                code...
                modification;
            } while ( condition );
        */

        int i = 1;
        do {
            System.out.println("This is "+ i);
            i++;
        }while (i<=10);
    }
}

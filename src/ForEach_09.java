public class ForEach_09 {
    public static void main(String[] args) {
        /*syntax [this is a read-only loop system]
            for(data_type variable_name : array/list){
                code....
                code....
            }
        */

        int[] num = {1,2,3,4,5};
        for(int a : num){
            System.out.println("This is "+a);
        }
    }
}

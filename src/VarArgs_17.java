public class VarArgs_17 {
    public static int add (int ...arr){
        int result =0;
        for(int a : arr){
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4,5));
    }
}

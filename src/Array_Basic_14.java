public class Array_Basic_14 {
    public static void main(String[] args) {
        //Array is a collection of data || data can be accessed easily
        /*Syntax : datatype[] array_name = {val1, val2, val3, ....};*/

        String[] cities = {"Istanbul", "Bursa", "Ankara", "Iznik", "Capaddocia"};
        int[] val = {45,87,26,19,35,38,92};

        //length of array
        System.out.println(cities.length);

        //printing array
        for(String sr : cities){
            System.out.println(sr + " ");
        }

        //printing specific value [index can be 0-(length-1)]
        System.out.println(val[6]);

        //change array element
        System.out.println("Previous value : " + cities[3]);
        cities[3] = "Amasya";
        System.out.println("New value : " + cities[3]);

        //array can be 1. one dimensional & 2. multi-dimensional. cities & val is the example of one dimensional array
        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        //printing multi-dimensional array
        for(int i=0; i< numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

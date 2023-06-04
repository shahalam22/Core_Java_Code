public class this_super_22 {

//    this keyword eliminates the confusion between the parameters and the class attributes with the same name
//    A reference variable used to refer immediate parent class object.
//    It can be used to refer immediate parent class instance variable.
//    It can be used to invoke the parent class method.

    static  class base{
        int x;

        public base(int x){
            this.x = x;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
        public void print(){
            System.out.println("Creating values!!");
        }
    }
    static class derived extends base {
        int y;

        public derived(int x, int y){
            super(x);
            this.y = y;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public static void main(String[] args) {
        base b1 = new base(1);
        System.out.println(b1.getX());
        b1.print();

        derived d1 = new derived(2,3);
        System.out.println(d1.getX());
        System.out.println(d1.getY());
        d1.print();
    }
}

public class Inheritance_21 {

    /*

    class super-class {

    }

    class sub-class extends super-class{

    }

    by this we can borrow methods and attributes from super-class to sub-class
    */

    static  class base{
        int x;

        public int getX() {
            return x;
        }

        public void setX(int xin) {
            x = xin;
        }
        public void print(){
            System.out.println("Creating values!!");
        }
    }
    static class derived extends base{
        int y;

        public int getY() {
            return y;
        }

        public void setY(int yin) {
            y = yin;
        }
    }

    public static void main(String[] args) {
        base b1 = new base();
        b1.setX(1);
        System.out.println(b1.getX());
        b1.print();

        derived d1 = new derived();
        d1.setX(2);
        d1.setY(3);
        System.out.println(d1.getX());
        System.out.println(d1.getY());
        d1.print();
    }
}

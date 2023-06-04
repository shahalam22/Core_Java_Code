public class method_overriding_23 {

    //If the child class implements the same method present in the parent class again with, it is know as method overriding.
    //when we need some modification over the methods of parent class for the child class in that case we override the method of parent class in child class.
    //Method overriding helps us to classify a behavior that is specific to the child class.
    //The subclass can override the method of the parent class only when the method is not declared as final.

//    example 1

    static  class base{
        int x;

        public base(int x){
            this.x = x;
        }

        public int getX() {
            return x;
        }

        public void print(){
            System.out.println("This is print from base class");
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

        @Override
        public void print(){
            System.out.println("This is print from derived class");
        }
    }

//    example 2

    static class A {
        int a;
        public A(int a){
            this.a = a;
        }
        public void show(){
            System.out.println("This is method of A class");
        }
    }

    static class B extends A{
        int b;
        public B(int a, int b){
            super(a);
            this.b = b;
        }
        @Override
        public void show(){
            System.out.println("This is method of B class");
        }
    }

    static class C extends B {
        int c;
        public C(int a, int b, int c){
            super(a, b);
            this.c = c;
        }
        public void show(){
            System.out.println("This is method of C class");
        }
    }

    public static void main(String[] args) {

//      example 1
        base b1 = new base(1);
        System.out.println(b1.getX());
        b1.print();

        derived d1 = new derived(2,3);
        System.out.println(d1.getX());
        System.out.println(d1.getY());
        d1.print();

//        example 2
        A A1 = new A(1);
        A1.show();

        B B1 = new B(2,3);
        B1.show();

        C C1 = new C(4, 5, 6);
        C1.show();
    }
}

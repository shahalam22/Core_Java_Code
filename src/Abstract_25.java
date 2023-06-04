public class Abstract_25 {
    //Those methods which have no body but only have their signature are called Abstract methods
    //Those classes which contains abstract methods are called Abstract class
    //Abstract class can't be instantiated

    abstract static class greet{
        public void greet1(){
            System.out.println("Assalamu-Alaikum");
        }

        abstract public void greet2();
        abstract public void greet3();
    }

    static class man1 extends greet{
        String name;
        public man1(String name){
            this.name = name;
        }

        @Override
        public void greet2(){
            System.out.println("Good Morning!.");
        }

        @Override
        public void greet3(){
            System.out.println("Welcome to Istanbul!");
        }

        public void greet4(){
            System.out.println("Good AfterNoon, " + this.name);
        }
    }

    public static void main(String[] args) {
//        greet g1 = new greet();       // we can't create class

        man1 m1 = new man1("Abir");
        m1.greet1();
        m1.greet2();
        m1.greet3();
        m1.greet4();

        greet m2 = new man1("Shah");
        m2.greet1();
        m2.greet2();
        m2.greet3();
//        m2.greet4();      //we can't access this as the reference is of parent class. abstract class can have reference but can't have instantiation.

    }
}

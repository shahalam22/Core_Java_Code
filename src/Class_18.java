public class Class_18 {

    /*syntax

    access_modifier class class_name{
        attribute1
        attribute2
        attribute3

        method1
        method2
        method3
    }

    */
    //to inherit class we use "extends" keyword

    //class 1
    public static class Employee{
        int id;
        int salary;
        String name;
        public void printDetails(){
            System.out.println("My id is " + id);
            System.out.println("My name is " + name);
        }
        public int getSalary(){
            return salary;
        }
    }

    //class2
    static class cellphone{
        public void ring(){
            System.out.println("Ringing...");
        }
        public void vibrate(){
            System.out.println("Vibrating...");
        }
        public void callFnf(){
            System.out.println("Calling Friend...");
        }
    }

    //class 3
    static class square{
        int side;
        public int area(){
            return side*side;
        }
        public int perimeter(){
            return 4*side;
        }
    }

    public static void main(String[] args) {
        System.out.println("This is our custom class.");

        //class 1
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        //setting e1's attributes
        e1.id = 001;
        e1.salary = 40;
        e1.name = "Shah Alam";

        //setting e2's attributes
        e2.id = 002;
        e2.salary = 45;
        e2.name = "Shah Newaz";

        e1.printDetails();
        e2.printDetails();

        System.out.println(e1.getSalary());

        //class 2
        cellphone c1 = new cellphone();

        c1.ring();
        c1.vibrate();
        c1.callFnf();

        //class 3
        square s1 = new square();

        s1.side = 3;

        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}

public class Constructor_20 {

    //Constructor in java is used to create the instance of the class. Constructors are almost similar to methods except for two things - its name is the same as the class name and it has no return type

    static class Employee{
        private String name;
        private int id;

        //constructor
        public Employee(){
            id = 0;
            name = "Your-Name-here";
        }
        //overloaded constructor
        public Employee(String myName){
            id = 1;
            name = myName;
        }
        //overloaded constructor
        public Employee(int myId, String myName){
            id = myId;
            name = myName;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Shah Alam");
        Employee e3 = new Employee(1439, "Abir");

        System.out.println(e1.getName());
        System.out.println(e1.getId());
        System.out.println(e2.getName());
        System.out.println(e2.getId());
        System.out.println(e3.getName());
        System.out.println(e3.getId());
    }
}

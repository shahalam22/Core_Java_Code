public class AM_getter_setter_19 {
    /*Access Modifier	within class	within package	outside package by subclass only	outside package
        public	            Y	                Y	                    Y                           Y
        protected	        Y	                Y	                    Y	                        N
        Default	            Y	                Y	                    N	                        N
        private	            Y	                N	                    N	                        N
    */

    //getter & setter are being used to get and set the private value from outside of the class.

    static class Employee{
        private String name;
        private int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setName("SHAH ALAM");
        e1.setId(001);

        System.out.println(e1.getName());
        System.out.println(e1.getId());
    }
}

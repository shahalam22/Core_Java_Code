public class Interface_26 {
    //interfaces are like an abstract class all the methods of which are abstract, all the attributes of which class is final by default
    //we can't extend more than one class but can implement more than one interface
    //to inherit interfaces we use the "implements" keyword

    //Though all the methods of interface is abstract by default, Java introduced a new method which could have body. This special kind of method is called default method. We have to use default keyword to make a default method

    //It's called polymorphism when a method[of same signature] works differently or generates different outputs.

    interface human{
        default void greet(){
            System.out.println("Assalamu-Alaikum");
        }
        public void region();
    }

    interface food{
        public void traditional(String food);
    }

    static class african implements human, food{
        @Override
        public void region(){
            System.out.println("Hello I'm from Africa");
        }
        @Override
        public void traditional(String food){
            System.out.println("Our tradional food is " + food);
        }
    }

    static class asian implements human, food{
        @Override
        public void region(){
            System.out.println("Hello I'm from Asia");
        }
        @Override
        public void traditional(String food){
            System.out.println("Our tradional food is " + food);
        }
    }

    static class european implements human, food{
        @Override
        public void region(){
            System.out.println("Hello I'm from Europe");
        }
        @Override
        public void traditional(String food){
            System.out.println("Our tradional food is " + food);
        }
    }

    //interface of interfaces
    interface humanDo {
        public void canCook();
        public void canWalk();
    }

    interface humanCan extends humanDo{
        public void canHunt();
        public void canSwim();
    }

    static class humanInperson implements humanCan{
        @Override
        public void canCook(){
            System.out.println("He can cook");
        }
        @Override
        public void canWalk(){
            System.out.println("He can walk");
        }
        @Override
        public void canHunt(){
            System.out.println("He can hunt");
        }
        @Override
        public void canSwim(){
            System.out.println("He can swim");
        }
    }


    public static void main(String[] args) {

        african h1 = new african();
        h1.region();
        h1.traditional("Fish");

        asian h2 = new asian();
        h2.region();
        h1.traditional("Rice");

        european h3 = new european();
        h3.region();
        h1.traditional("Meat");

        //interface of interface
        humanInperson h4 = new humanInperson();
        h4.canCook();
        h4.canWalk();
        h4.canHunt();
        h4.canSwim();
    }
}

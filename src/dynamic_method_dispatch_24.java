public class dynamic_method_dispatch_24 {
//    Dynamic method dispatch is also known as run time polymorphism.
//It is the process through which a call to an overridden method is resolved at runtime.
//This technique is used to resolve a call to an overridden method at runtime rather than compile time.
//To properly understand Dynamic method dispatch in Java, it is important to understand the concept of upcasting because dynamic method dispatch is based on upcasting.
//Upcasting : It is a technique in which a superclass reference variable refers to the object of the subclass. If the reference is of super class then we only can access the methods and the attributes of the super class.

    static class phone{
        public void camera(){
            System.out.println("Turning on camera...");
        }
        public void playGame(){
            System.out.println("Entering into game...");
        }
    }

    static class smartphone extends phone{
        public void camera(){
            System.out.println("Turning on smartphone's camera...");
        }
        public void playMusic(){
            System.out.println("Playing music...");
        }
    }

    public static void main(String[] args) {
        phone p1 = new smartphone();
        p1.camera();    //this will print smartphone's camera
        p1.playGame();
//        p1.playMusic();   //we can't access this as the reference is of super class.
    }

}

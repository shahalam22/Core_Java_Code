public class Thread_28 {
    /* Syntax
     way 1 -
     class class_name extends Thread{
        @Override
        public void run(){
            code...
        }
     }

     way 2 -
     class class_name implements Runnable{
        @Override
        public void run(){
            code...
        }
     }
    */

    //way - 1 extending to Thread class
    static class thread1 extends Thread{
        //constructor
        public thread1(String name){
            super(name);
        }
        //run method
        @Override
        public void run(){
            int i = 0;
            while (i<5000){
                System.out.println("Thread 1 is running...");
                i++;
            }
        }
    }
    static class thread2 extends Thread{
        //constructor
        public thread2(String name){
            super(name);
        }
        //run method
        @Override
        public void run(){
            int i = 0;
            while (i<5000){
                System.out.println("Thread 2 is running...");
                i++;
            }
        }
    }

    //way - 2 implementing Runnable class

    static class thread3 implements Runnable{
        @Override
        public void run(){
            for(int i=0; i<5000; i++){
                System.out.println("Thread 3 is running...");
            }
        }
    }

    public static void main(String[] args) {
        //Way - 1
        thread1 t1 = new thread1("Shah Alam");
        thread2 t2 = new thread2("Abir");
        //way - 2
        thread3 t3 = new thread3();     //t3 is like bullet
        Thread exeT3 = new Thread(t3);  //exeT3 [executable t3] is like gun where we load bullet

        //thread priorities
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Name of t1 is - "+t1.getName());
        System.out.println("Priority of t1 is - "+t1.getPriority());
        System.out.println("Name of t2 is - "+t2.getName());
        System.out.println("Priority of t2 is - "+t2.getPriority());

        t1.start();
        t2.start();
        exeT3.start();
    }
}

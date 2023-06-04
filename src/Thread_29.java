import java.io.*;
import java.lang.Thread;
import java.time.Duration;

public class Thread_29 {

    //Sleep() method
//        The sleep() method in Java is useful to put a thread to sleep for a specified amount of time.
//        Syntax of sleep() - public static void sleep(long milliseconds)throws InterruptedException
//        Syntax of sleep() - public static void sleep(long milliseconds, int nanos)throws InterruptedException

    //way - 1 using sleep
//    public static void main(String[] args) {
//        try{
//            for(int i=1; i<=5; i++){
//                Thread.sleep(2000);
//                System.out.println(i);
//            }
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//    }

    //way - 2 using sleep
//    static class thread1 extends Thread{
//        @Override
//        public void run(){
//            for(int i=0; i<5; i++) {
//                System.out.println("This is thread 1. value - " + i);
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        thread1 t1 = new thread1();
//        t1.start();
//    }

    //Interrupt() method
//    A thread in a sleeping or waiting state can be interrupted by another thread with the help of the interrupt() method of the Thread class.
//    The interrupt() method throws InterruptedException.
//    The interrupt() method will not throw the InterruptedException if the thread is not in the sleeping/blocked state, but the interrupt flag will be changed to true.
//static class thread2 extends Thread{
//        public void run(){
//            try{
//                for(int i=0;i<5; i++){
//                    System.out.println("Child thread...");
//                    thread2.sleep(4000);
//                }
//            }
//            catch (InterruptedException e){
//                System.out.println("Child thread interrupted");
//            }
//            System.out.println("Thread is running...");
//        }
//    }
//
//    public static void main(String[] args) {
//        thread2 t2 = new thread2();
//        t2.start();
//        t2.interrupt();
//        System.out.println("Main thread");
//    }

}
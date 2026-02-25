package com.multiThread;
class mv implements Runnable {

    public void run() {
       try {
            System.out.println(Thread.currentThread().getName() + " has started writing the exam.");
            
            Thread.sleep(5000);
            
            System.out.println(Thread.currentThread().getName() + " is still writing...");
            
            Thread.sleep(3000);
            
            System.out.println(Thread.currentThread().getName() + " has completed the exam.");
            
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}


public class Text {
    public static void main(String[] args) {

        mv t1 = new mv();

        Thread t2 = new Thread(t1);
        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t1);
        Thread t5 = new Thread(t1);

        t2.setName("Student 1");
        t3.setName("Student 2");
        t4.setName("Student 3");
        t5.setName("Student 4");

        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}



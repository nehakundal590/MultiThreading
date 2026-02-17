
package com.multiThread;

class cv2 extends Thread {

    Thread t;

    // Constructor
    cv2(Thread t) {
        this.t = t;
    }

    public void run() {
        try {
            t.join();   // Wait for main thread to complete

            for (int i = 0; i <= 10; i++) {
                System.out.println("hii " + i);
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class JoinMethod2 {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        cv2 c1 = new cv2(t);
        c1.start();

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("hello " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



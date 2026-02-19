package com.multiThread;


class Account {
    void transfer(Account acc) {
        synchronized (this) {
            try { Thread.sleep(100); } catch (Exception e) {}
            synchronized (acc) {
                System.out.println("Transfer completed");
            }
        }
    }
}

public class DeadLock2 {
    public static void main(String[] args) {

        Account acc1 = new Account();
        Account acc2 = new Account();

        Thread t1 = new Thread(() -> acc1.transfer(acc2));
        Thread t2 = new Thread(() -> acc2.transfer(acc1));

        t1.start();
        t2.start();
    }
}

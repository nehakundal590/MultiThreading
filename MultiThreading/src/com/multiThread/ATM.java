package com.multiThread;


class Atm1 {

    synchronized public void withdraw(String name, int amount) {

        System.out.println(name + " Entered the ATM");

        try {
            Thread.sleep(3000);

            System.out.println(name + " is withdrawing Amount " + amount);

            Thread.sleep(3000);

            System.out.println(name + " Complete the Transaction");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ATM{

    public static void main(String[] args) {

        Atm1 a1 = new Atm1();

        Runnable r1 = () -> a1.withdraw("USER-01", 3000);
        Runnable r2 = () -> a1.withdraw("USER-02", 7000);
        Runnable r3 = () -> a1.withdraw("USER-03", 0000);

        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
        
    
    }
}

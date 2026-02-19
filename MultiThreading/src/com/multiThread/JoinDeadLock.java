package com.multiThread;


class JoinDeadlock extends Thread {

    public void run() {
        try {
            Thread.currentThread().join();
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        JoinDeadlock t = new JoinDeadlock();
        t.start();
    }
}

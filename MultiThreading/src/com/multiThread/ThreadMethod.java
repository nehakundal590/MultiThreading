package com.multiThread;

 class oa implements Runnable {
	public void run() {
		System.out.println("hii");
		System.out.println(Thread.currentThread().getName());
		}
	}
public class ThreadMethod {
	public static void main(String[] args) {
		oa d1=new oa();
		Thread t1=new Thread(d1);
		t1.start();
      System.out.println(Thread.currentThread().getName());
		System.out.println(t1.isAlive());
	}


}

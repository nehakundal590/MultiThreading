package com.multiThread;
class Text4 extends Thread{
	public void run(){
		System.out.println("hii");
		System.out.println("hi:"+Thread.currentThread().getName());
		System.out.println("child thread:"+Thread.currentThread().getPriority());
		}
}

public class PriorityMethods {
	public static void main(String[] args) {
		
		Thread t1=new Thread();
		t1.start();
		
		t1.setPriority(8);
		System.out.println("child thread Priority:" +t1.getPriority());
		System.out.println("hello:"+Thread.currentThread().getName());
		System.out.println("main thread Priority:"+Thread.currentThread().getPriority());
	}

}

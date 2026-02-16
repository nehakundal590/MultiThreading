package com.multiThread;
class demo extends Thread{
	public void run() {
		System.out.println("hii");
	}
	}

public class PriorityMethod2 {
	public static void main(String[] args) {
		demo d1=new demo();
		d1.start();
		d1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(d1.getPriority());
		
	}

}

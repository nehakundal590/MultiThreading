package com.multiThread;


class text2 extends Thread{
	public void run() {
		System.out.println("hi");
		System.out.println("child thread:"+Thread.currentThread().isDaemon());
		
	}
}
public class DaemonThreadCases {
	public static void main(String[] args) {
		text2 t1=new text2();
		t1.setDaemon(true);
		t1.start();
		System.out.println("main thread:"+Thread.currentThread().isDaemon());

	}

}
package com.multiThread;
class nm extends Thread{
	public void run() {
		System.out.println("hi");
		System.out.println("child thread:"+Thread.currentThread().isDaemon());
		
	}
}
public class DaemonThread {
	public static void main(String[] args) {
		nm t1=new nm();
		t1.setDaemon(true);
		t1.start();
		System.out.println("main thread:"+Thread.currentThread().isDaemon());

	}

}

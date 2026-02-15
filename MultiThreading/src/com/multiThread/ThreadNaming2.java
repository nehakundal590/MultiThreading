package com.multiThread;
class text extends Thread{
	public void run() {
		System.out.println("hii");
		System.out.println("old child thread:"+Thread.currentThread().getName());
		Thread.currentThread().setName("my_child ThreadName");
		System.out.println("new child thread:"+Thread.currentThread().getName());
	}
}

public class ThreadNaming2 {
	public static void main(String[] args) {
		System.out.println("old main thread:"+Thread.currentThread().getName());
		Thread.currentThread().setName("my_main child ThreadName");
		System.out.println("new child thread:"+Thread.currentThread().getName());
	
		text t1=new text();
		t1.start();
		
	}

}

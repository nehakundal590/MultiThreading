package com.multiThread;
class Test1 extends Thread{
	public void run() {
		// thread task
		for(int i=0;i<=100;i++) {
			System.out.println("child thread");
		}
		
	}
	
}

public class Test{
	
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.start();
		for(int i=0;i<=100;i++) {
			System.out.println("main thread");
		}
	}

}

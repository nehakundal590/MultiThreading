package com.multiThread;
class MyThread extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
		System.out.println(i);
	}
	
}

public class Demo {
	public static void main(String[] args) {
		MyThread mt1=new MyThread();
		mt1.run();
	}
}
	

}
class MyThread implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class Demo{
	public static void main(String[] args) {
		MyThread mt1=new MyThread();
		Thread mt2=new Thread(mt1);
		mt2.setName("thread1");
		mt2.start();
	}
}



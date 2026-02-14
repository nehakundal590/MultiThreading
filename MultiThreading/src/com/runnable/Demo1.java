package com.runnable;
class Test1 extends Thread{
	public void run() {
		System.out.println("hii");
	}
	
}

public class Demo1 {
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.start();
		//t1.start();--java.lang.IllegalThreadStateException
	}

}

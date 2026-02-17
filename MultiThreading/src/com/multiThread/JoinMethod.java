package com.multiThread;
class cb extends Thread{
	public void run() {
		try {
		for(int i=0;i<=10;i++) {
		System.out.println("hi"+i);
		
			Thread.sleep(1000);
		}
		}
		 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}


public class JoinMethod {
	public static void main(String[] args) {
		cb t1=new cb();
		t1.start();

		try{
			t1.join();
			
		for(int i=0;i<=10;i++) {
		System.out.println("hello"+i);
		Thread.sleep(1000);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	
	
	}



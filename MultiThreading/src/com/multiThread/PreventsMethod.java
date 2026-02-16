package com.multiThread;
class demo2 extends Thread{
	public void run() {
		try {
			for(int i=0;i<=10;i++) {
				System.out.println(i);
			Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
			
		}
		
}

public class PreventsMethod {
	public static void main(String[] args) {
		demo2 d2=new demo2();
		d2.start();
		}
}

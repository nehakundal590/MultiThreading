 //Thread Class Method
package com.multiThread;
class abc implements Runnable{
	public void run() {
		System.out.println("hii");
		}
	}
public class Lecture4 {
	public static void main(String[] args) {
		abc d1=new abc();
		Thread t1=new Thread(d1);
		System.out.println();
	}

}

package com.multiThread;
class Demoo implements Runnable{
	public void run(){
		try {
		System.out.println(Thread.currentThread().getName()+"student giving the exam");
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName()+"is still writing");
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName()+"student complete the exam");
		
		
		}
		catch(Exception e) {
			System.out.println();
		}
		
	}
	
}

public class StudentExam {
	public static void main(String[] args) {
		Demoo d1=new Demoo();
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d1);
		Thread t3=new Thread(d1);
		
		t1.setName("student1");
		t2.setName("student2");
		t3.setName("student3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}

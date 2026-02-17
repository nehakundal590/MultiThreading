package com.multiThread;
class TakeAdmission extends Thread{
	public void run() {
		try {
		System.out.println("admission start");
		Thread.sleep(1000);
		System.out.println("you take admission succesfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Deposit extends Thread{
	public void run() {
		try {
			System.out.println("depositing fees");
			Thread.sleep(2000);
			System.out.println("ypu have deposit the fees sucefully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class TakeRollno extends Thread{
	public void run() {
		try {
		System.out.println("Take rollno");
		Thread.sleep(200);
		System.out.println("now you can sit in exams..");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}

public class ClgAdmin {
	public static void main(String[] args) throws InterruptedException{
		TakeAdmission t1=new TakeAdmission();
		t1.start();
		t1.join();
		
		
		Deposit d1=new Deposit();
		d1.start();
		
		d1.join();
		
		TakeRollno d2=new TakeRollno();
		d2.start();
		
	}

}

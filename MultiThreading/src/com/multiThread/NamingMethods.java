package com.multiThread;
public class NamingMethods {

void divide() {
	int a=100,b=0,c;
	c=a/b;
	System.out.println(c);
}


	public static void main(String[] args) {
		Thread.currentThread().setName("neha");
		NamingMethods n=new NamingMethods();
		n.divide();
		
	}

}


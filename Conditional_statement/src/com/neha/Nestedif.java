package com.neha;

import java.util.Scanner;

public class Nestedif {
 public static void main(String[]args) {
	 int num;
	 System.out.println("enter the value of number");
	 Scanner sc= new Scanner(System.in);
	 num = sc.nextInt();
	 if(num>=0) {
		 System.out.println("number is greater than or equal to Zero");
		 if(num==0) {
			 System.out.println("Number is zero");
		 }
	 }
		
	}

}

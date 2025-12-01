package com.neha;
import java.util.Scanner;

public class if_statement {
	//ctrl+shift+o
	public static void main(String args[]) {
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("a is greater than b and c");
			
		}
	 if(c>a && c>b) {
			System.out.println("b is greater than c and a");
		}
		else {
			System.out.println("b is greater number");
		}
	}

}

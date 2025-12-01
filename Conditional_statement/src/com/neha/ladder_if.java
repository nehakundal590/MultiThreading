package com.neha;
import java.util.Scanner;

public class ladder_if {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>300) {
			num=num+30;
			System.out.println(num);
			
		}
		if(num>250) {
			num=num+50;
			System.out.println(num);
			
		}
		if(num>200) {
			num=num+40;
			System.out.println(num);
			
		}
		if(num>150) {
			num=num+60;
			System.out.println(num);
			
		}
		
	}

}

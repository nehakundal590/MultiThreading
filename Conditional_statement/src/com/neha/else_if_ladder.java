package com.neha;
import java.util.Scanner;

public class else_if_ladder {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner("enter the number");
		int marks=sc.nextInt();
		if(marks>=90) 
			
			System.out.println("A");
			
			
			
		else if(marks>=60) 
			
			System.out.println("B");
			
			
		else if(marks>=50) 
			System.out.println("C");
			
			
		else if(marks>=20) 
			System.out.println("D");
			
			
			
		
		else 
			System.out.println("fail");
			
		}
	}
		
	



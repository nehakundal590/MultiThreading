package com.multiThread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceDemo {
	public static void main(String[] args) {
		try(BufferedReader b1=new BufferedReader(new FileReader("file.txt"))){
		String line=b1.readLine();
		System.out.println(line);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}

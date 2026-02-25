package com.multiThread;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource2 {
	public static void main(String[] args) {
		try(FileWriter f1=new FileWriter("output.txt")){
		f1.write("try java code");
		System.out.println("data written succesfully");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
/* fileWriter class java.io.package
 * output.txt= file name
 * File Writer automatically closable if after the try block
 * text will be stored in output txt
 * print successful msg on code.
 * 
 * This program uses try-with-resources to write data into a file. The FileWriter resource is automatically closed 
 * after execution, preventing memory leaks and making the code cleaner.This program uses try-with-resources 
 * to write data into a file. The FileWriter resource is automatically closed after execution,
 *  preventing memory leaks and making the code cleaner.
 * */

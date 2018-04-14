package com.kamotelabs.tutorial48;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
	
	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		try (FileOutputStream fs = new FileOutputStream("test.ser"); ObjectOutputStream os = new ObjectOutputStream(fs)) {
			
			Person person = new Person(7, "Bob");
			os.writeObject(person);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

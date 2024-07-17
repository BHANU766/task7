package com.task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Que4 {

	public static void main(String[] args) {
		//file not found
		File file=new File("demo.txt");
		try {
	    	FileReader fr=new FileReader(file);
		}catch(FileNotFoundException e) {
		   e.printStackTrace();
		   
	}
		
 
	}
		
}
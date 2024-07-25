package com.task7;

import java.util.ArrayList;
import java.util.List;

public class Que7 {	

		    public static void main(String[] args) {
		        // Create a List of Strings
		        List<String> list = new ArrayList<>();
		        list.add("tethala");
		        list.add("bhanu");
		        list.add("rekha");

		        // Convert List to Array
		        String[] array = list.toArray(new String[0]);

		        // Print the Array
		        System.out.println("Array elements:");
		        for (String element : array) {
		            System.out.println(element);
		        }
		    
		}

        
	}


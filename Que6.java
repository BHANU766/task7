package com.task7;

import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Que6 {

	public static void main(String[] args) {
		   
		        // Create a TreeMap to store employee IDs and names
		        TreeMap<Integer, String> tm = new TreeMap<>();
		       
		        tm.put(102, "srinu");
		        tm.put(101, "mangu");
		        tm.put(105, "sowji");
		        tm.put(104, "rekha");
		       
		        // Extract names from the TreeMap
		        List<String> names = new ArrayList<>(tm.values());

		        // Sort names alphabetically
		        Collections.sort(names);

		        // Print the names in alphabetical order
		        System.out.println("Employee names in alphabetical order:");
		        for (String name : names) {
		            System.out.println(name);
		        }
		    }
		

	}



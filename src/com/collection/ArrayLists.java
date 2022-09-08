package com.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
	public static void main(String[] args) {
		//    	int i[]= {1,2,3,4,5};
		//    	System.out.println(i.length);
		
		
		
		
		
	//	List<Integer>numbers = new ArrayList<>();
        ArrayList<Integer>numbers = new ArrayList<>();
	//	ArrayList<Object>numbers = new ArrayList<>();
        
		numbers.add(1);
		numbers.add(4);
	    numbers.add(2);

		System.out.println(numbers.size());
		System.out.println(numbers);
		
		numbers.add(5);
		numbers.add(2);                                 // add number
		System.out.println(numbers);
		
		numbers.add(1, 6);                              // add number in which index
		System.out.println(numbers);
		numbers.set(2, 13315);                          // update
	//	numbers.remove(2);                              // remove number
	    System.out.println(numbers.size());
	    System.out.println(numbers);
	//	Collections.sort(numbers);                      // sort numbers
			
		Collections.replaceAll(numbers, 13315, 12354);
		System.out.println(numbers);
		Collections.sort(numbers);
		
     	System.out.println(numbers.size());
		System.out.println(numbers.toString());
		System.out.println(numbers.get(3));
		numbers.set(3, 23566);
		System.out.println(numbers.hashCode());
		numbers.remove(3);
		
		
     
		for(int i=0;i<numbers.size();i++) 
		{
			
			System.out.print(numbers.get(i)+" ");
		}
		
		
		for(int key:numbers) 
		{
			System.out.print("\n"+key+" ");
		}
	  
	  
	    System.out.println("\n"+numbers.isEmpty());
    	numbers.clear();
    	System.out.println("\n"+numbers.isEmpty());

	}
}

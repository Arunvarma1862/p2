package com.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class linkedlist2 {
	public static void main(String[] args) {

	//	ArrayList<Integer> num= new ArrayList<>();
	//	ArrayList          num= new ArrayList();                   // for( Object num: numbers)
	//	ArrayList<String>  name=  new ArrayList<>();
		LinkedList<String> name = new LinkedList<>();
	//	ArrayDeque<String> name = new ArrayDeque<>();
		
		
//		num.add(14);
//		num.add(21);
//		num.add(95);
		
//		System.out.println(num);
//		System.out.println(num.size());
		
//		num.add(11);
//		num.add(51);
//		num.add(65);
		
	//	num.remove(Integer.valueOf(14));
		
//		System.out.println(num);
//		System.out.println(num.size());
//		System.out.println(num.toString());
//		System.out.println(num.contains(51));
		
//		num.remove(4);
//		System.out.println(num);
//		
//		System.out.println(num.isEmpty());
//	
//		 num.remove(3);
		
//		 System.out.println(num);
//		 Collections.sort(num);
//		 System.out.println(num);
		
//		    num.clear();
//		    num.set(3, 44);
//		    num.add(2, 12221);
//			num.remove(1);
		   
		
//			for(int i=0;i<num.size();i++)
//	        System.out.print(num.get(i)+"  ");

		    
		    
//			for(int print:num)
//			System.out.println(print);
//
//
//			
//		System.out.println(num);
		
		name.add("amul");
		name.add("milk");
		name.add("india");
		System.out.println(name);
		name.remove(1);
		System.out.println(name);
		name.add("england");
		System.out.println(name);
		
	//	name.add(2,"com");
	//	System.out.println(name);
		System.out.println(name.size());
	//	name.remove("milk");
		name.push("abcd");
		System.out.println(name);
	//	name.remove();                                      // fifo
		name.poll();
		System.out.println(name);
		System.out.println(name.get(2));
		System.out.println(name.getFirst());
		
		System.out.println(name);
	//	System.out.println(name.get(3));
	//	name.set(1,"efgh");
		System.out.println(name);
		System.out.println(name.toArray());
		System.out.println(name.toString());
		
		
//		for(String bar:name)
//		System.out.println(bar);
		
		
//	    for(int i=0;i<name.size();i++)
//	    System.out.print(name.get(i)+"  ");
		
		
		
		
	}
}

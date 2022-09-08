package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class queque {
     public static void main(String[] args) {
    	 
		  Queue<String> q = new PriorityQueue<>();
		  
		  q.add("hello");
		  q.add("bye");
		  q.add("hiiiiii");
		  
		  System.out.println(q);
		  System.out.println(q.peek());
		  System.out.println(q.toString());
		  
		  q.poll();
		  q.add("india");
		  
		  System.out.println(q.peek());
	//	  q.poll();
	//	  q.remove();
		  q.offer("abcd"); 
		  System.out.println(q);
		  
	}
}

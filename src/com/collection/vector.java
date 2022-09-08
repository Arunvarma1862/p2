package com.collection;

import java.util.Vector;

public class vector {
	
     public static void main(String[] args) {
    	 
	      Vector<String > v = new Vector<>();
	      
	      
	      v.add("abc");
	      v.add("abcd");
	      v.add("abcde");
	      v.add("abcx");
	      v.add("abct");
	      
	      System.out.println(v);
	      System.out.println(v.size());
	      System.out.println(v.firstElement());
	      
	      v.set(4, "sjgdsjadsaj");
	      System.out.println(v);
	      v.remove("abc");
	      System.out.println(v);
	      System.out.println(v.get(3));
	      v.remove(2);
	      System.out.println(v);
	      v.add("djakgkj");
	      System.out.println(v);
	}
}

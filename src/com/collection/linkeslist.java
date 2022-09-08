package com.collection;

import java.util.LinkedList;
import java.util.List;

public class linkeslist {
	public static void main(String[] args) {
		
		//     LinkedList<Object> ld = new LinkedList<>();
		//     LinkedList<String> ld = new LinkedList<>();
		 //    LinkedList ld = new LinkedList<>();
		       LinkedList<String> ld = new LinkedList<String>();
		//	   LinkedList<Integer> ld = new LinkedList<>();
		// 	   LinkedList ld = new LinkedList<>();
		// 	   List ld = new LinkedList<>();

		ld.add("bcgah");
		ld.add("25664");
		ld.add("hiiii");
		ld.add(2, "link");
		System.out.println(ld);

		ld.push("abc");                        // FI
		System.out.println(ld );        
		ld.pop();                              // FO
		System.out.println(ld.toString());

	}
}

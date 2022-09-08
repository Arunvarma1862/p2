package com.collection;

import java.util.Stack;

public class stack {
      public static void main(String[] args) {
		Stack<String>sta  = new Stack<>();
		
		sta.push("hi");
		sta.push("hii");
		sta.push("hiii");
		sta.push("hiiii");
		sta.push("hiiiiii");
		
		System.out.println(sta);
		sta.pop();                            // LIFO last in first out
		System.out.println(sta.toString());
		sta.push("ab");
		System.out.println(sta);
		sta.add(1, "abc");
		System.out.println(sta);
		sta.set(1, "abcd");
		System.out.println(sta);
		
		System.out.println(sta.get(3));
		System.out.println(sta.contains("abcd"));
		
	}
}

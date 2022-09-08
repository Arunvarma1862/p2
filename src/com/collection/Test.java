package com.collection;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
	/*int arr[]= {12,85,28,45,65};
	Arrays.sort(arr);
	for (int i : arr) {
		System.out.println(i);
	}
	System.out.println("2nd highest number"+arr[arr.length-2]);

	}*/
		
		String s1="aidni";
		String s2="";
	     char arr[]=s1.toCharArray();
     for (int i = arr.length-1; i >= 0; i--) {
		s2= s2+arr[i];
	}
     System.out.println(s2);

	}
	
	
}

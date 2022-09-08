package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ways {
  public static void main(String[] args) {
	Integer[] arr = {1,2,3};
	
//	List<Integer> al = new ArrayList<Integer> (Arrays.asList(arr));
	
	List<Integer> al = new ArrayList<Integer>();
	
      al.add(2);
      al.add(6);
      al.add(5);
      System.out.println(al);
      System.out.println(al.toString());
      
      List <Integer>  temp  =  List.of(1,2,3);
      al.addAll(temp);
      System.out.println(al);
      al.addAll(2, temp);
      
      al.addAll(List.of(1,23));
      al.addAll(1,List.of(8,9,7,24));
      System.out.println(al);
}
}

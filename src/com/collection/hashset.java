package com.collection;

import java.util.HashSet;
import java.util.Set;

public class hashset {
	public static void main(String[] args) {
          Set<String> set = new HashSet<>();
       // HashSet<String> set = new HashSet<>();
          
         set.add("mango");
         set.add("guavaa");
         set.add("orange");
         set.add("papaya");
         set.add("kiwi");
         set.add("kiwi");
         
         System.out.println(set.size());
         System.out.println(set.toString());
         set.add("null");
         System.out.println(set);
         
         for(String sets:set) {
       	 System.out.println(sets+" ");
        }
          set.remove("mango");
          System.out.println(set);
//          
	}
}

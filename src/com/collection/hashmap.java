package com.collection;

import java.util.HashMap;
import java.util.Set;


public class hashmap {

	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> map = new HashMap<>();
	//	HashMap  map = new HashMap<>();                            // Object 
	
		
		map.put(101, "amul");
		map.put(102, "amul baby");
		map.put(103, "ice");
		map.put(104, "cream");
		map.put(105, "babu");
		map.put(99, "babu");
		
		System.out.println(map.size());
		System.out.println(map.toString());
		System.out.println(map);
		
		map.put(100,"berry");                   //      sorting order 100
		System.out.println(map);
		map.put(106, "ice");                    //  n  no.of duplicate names of  ice allowed
		System.out.println(map);
		map.put(104, "choco");                  // override the value of 104,  key are override 
		System.out.println(map);
		
		map.remove(102);
		System.out.println(map);
		map.remove(102,"amul baby");
		map.put(107, "hello");
		map.put(108," hiii ");
		map.size();
		
		System.out.println(map);
		System.out.println(map.get(100));
		System.out.println(map.get(110));         // show null value of key 
		System.out.println(map.containsKey(105));
		System.out.println(map.containsValue("amul"));
		
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		
		
		Set<Integer> set = map.keySet();
	//	Set<Object> set = map.keySet();                // Object
		System.out.println(set.toString());
		
		for(int i=0;i<1;i++) 
		{
			for(Integer abc:set)
            {
//		    for(Object abc:set) {                      // Object
				System.out.print(abc+" >>>> "+map.get(abc));
		}
		}
		for(Integer abcd:set) {
		//	for(Object abcd:set) {                     // Object
			System.out.println(abcd+" >>>>>> "+map.get(abcd));
		}
		

	}

	}

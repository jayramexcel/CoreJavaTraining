package com.excelonline.core.collection;

import java.util.*;

public class TestingCollection {
//	static String array[] = {"Zero","ONE","TWO"}; //Jayram Rout
	static String array2[] = new String[5];
//	
//	static Integer array3[] = new Integer[5];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println("TestingCollection.main()" + array[0]);
////		array[3] = "Three";
//		
		array2[0] = "Zero";
		array2[1] = "One";
		array2[2] = "Two";
		array2[3] = "Four";
//		array2[4] = "Four";
//		array2[5] = "Five";
//		
//		String newArray[] = new String[10];
//		
//		int i = 0;
//		for(String str : array2){
//			newArray[i++] = str;
////			System.out.println(str);
//		}
//		System.out.println("TestingCollection.main()" + i);
//		newArray[i++] = "Five";
//		
//		System.out.println("TestingCollection.main()" + newArray[5]);
//		
////		array[1] = "hello";
//		
////		System.out.println("TestingCollection.main()" + array[3]);
//		
////		for(String str : array){
////			System.out.println(" After TestingCollection.main()" + str);
////		}
		
		/**
		 * Generics
		 */
//		List<String> fruits = new LinkedList<String>();
//		fruits.add("APPLE");
//		fruits.add("APPLE");
//		fruits.add("Mango");
//		fruits.add("Banana");
////		fruits.add(new Integer(111));
//		
////		Collections.sort(fruits);
////		fruits.add(2, 77);
//		System.out.println("First Index"+ fruits.get(0));
//		
//		for(String str : fruits){
//			System.out.println(" After TestingCollection.main()" + str);
//		}
		
//		System.out.println("LinkedList.main()" + list);
//		System.out.println("LinkedList.main()" + list.get(3));
//		list.remove(3);
//		System.out.println("LinkedList.main()" + list);
//		
//		list = new ArrayList();
//		list.add("ONE");
//		list.add("ONE");
//		list.add("TWO");
//		list.add("THREE");
//		list.add("FOUR");
////		list.add(new Integer(200));
//		
//		System.out.println("TestingCollection.main()"+ list);
//		System.out.println("TestingCollection.main()" + list.get(3));
//		list.remove(3);
//		list.add(3, "NINE");
//		
//		System.out.println("TestingCollection.main()"+ list);
//		/*
////		Collections.sort(list);
//		
//		System.out.println("TestingCollection.main()"+ list);
//		
//		for(Object j : list){
//			System.out.println("TestingCollection.main()" + ((String)j));
//		}
//		
//		System.out.println("TestingCollection.main()"+ list);
//		
//		
//		Set set = new HashSet();
//		set.add("ONE");set.add("ONE");set.add("ONE");
//		set.add("TWO");
//		set.add("THREE");
//		set.add("FOUR");
//		set.add("FIVE");
//		System.out.println("HashSet=========" + set);
//		
//		Set set = new TreeSet();
//		set.add("ONE");
//		set.add("TWO");
//		set.add("THREE");
//		set.add("FOUR");
//		set.add("FIVE");
////		
//		System.out.println("TreeSet==============" + set);
		
		Map<String,Person> map = new HashMap<String,Person>();
		Person p = new Person("Jayram","HYD","");
		
		map.put("1", p);
//		map.put("2", "TWO");
//		map.put("3", "THREE");
//		map.put("4", "FOUR");
//		map.put("4", "2ndFour");
//		map.put(null, null);
//		map.put(null, null);
		
		System.out.println("HashMap=" + map);
//		
//		System.out.println("HashMap==========" + map.get("4"));
//		
		Map tmap = new Hashtable();
		tmap.put("1", "ONE");
		tmap.put("2", "TWO");
		tmap.put("3", "THREE");
		tmap.put("4", "FOUR");
//		tmap.put(null, null);
		
//		tmap.put("", null); // No Room for null key or null value
//		
//		System.out.println("HashTable==========" + map);
//		*/
	}

}

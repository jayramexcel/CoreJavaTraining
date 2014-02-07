package com.excelonline.core.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample2{
	public static void main(String[] args) {
		Map<String,String> table = new Hashtable<String,String>();
		table.put("2", "TOWWWW");
		
		System.out.println("HashMapExample2.main()" + table);
		
		table.put("", null);
		/*table.put(null, null);*/
		System.out.println("HashMapExample2.main()" + table);
		
		Map<Object, Object> map = new HashMap<Object, Object>();
//		Map map = new HashMap();
		Person p = new Person("Jayram","Test","Te");
		
		map.put(1, p);
		map.put(2, "TWO");
		map.put(3, "THREE");
		map.put(4, "FOUR");
		map.put(5, "FIVE");
		
		map.put(null, null);
		System.out.println("HashMap print : "+map);
		map.put(6, "Six");
		
		
		System.out.println("HashMapExample2.main()" + map.get("3"));
		
		ArrayList listOfEmp = new ArrayList();
		listOfEmp.add("Srini");
		listOfEmp.add("Jayram");
		
		map.put(1, listOfEmp);
		map.put("Alton", listOfEmp);
		
		List deloitteAlton = (List)map.get("Alton");
		System.out.println(" deloitteAlton : " + deloitteAlton);
		
		
		System.out.println("LIST ONE>>>" + map.get(1));
		
		System.out.println("HashMapExample2.main()" + listOfEmp);
		
		Set myset = new HashSet(listOfEmp);
		
		System.out.println("HashMapExample2.main()" + myset);
		
//		myset.add(list.toArray());
//		System.out.println("HashMapExample2.main()" + myset.toString());
		
		Set  entry = map.entrySet();
		for(Object entObj : entry){
			Entry ent = (Entry)entObj;
			System.out.println("Key = "+ ent.getKey() +" Value = "+ent.getValue());
		}
		
		Set<Entry<Object, Object>>  entrynew = map.entrySet();
		for(Entry<Object,Object> ent : entrynew){
			System.out.println("Key = "+ ent.getKey() +" Value = "+ent.getValue());
		}
	}
}
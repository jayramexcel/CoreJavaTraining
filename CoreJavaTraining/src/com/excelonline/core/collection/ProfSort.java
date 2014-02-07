package com.excelonline.core.collection;

import java.util.Comparator;

public class ProfSort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Person p1 = ((Person)o1);
		String prof1 = p1.getProfession();
		
		Person p2 = ((Person)o2);
		String prof2 = p2.getProfession();
		System.out.println("prof1 = "+ prof1 +" prof2=" + prof2+" " + (prof1).compareTo(prof2));
		
		return (prof1).compareTo(prof2);
	}
}
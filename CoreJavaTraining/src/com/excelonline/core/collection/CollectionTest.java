package com.excelonline.core.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * @author Jayram Rout
 *
 */
public class CollectionTest {
	public String callMe(){
		return "Hello Boy";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * ArrayList is Growable
		 * It is Ordered , Sorted
		 */
		Vector vec = new Vector();
		vec.add("ONE");
		/*List<String> listOne = new ArrayList<String>();
//		List listOne = new ArrayList();
		listOne.add("ONE");
		listOne.add("NINE");
		listOne.add("TWO");
		listOne.add("THREE");*/
		
//		listOne.add(new CollectionTest());
		
//		System.out.println(listOne.hashCode()); // 380037963
		
		/*for(int i = 0 ; i < listOne.size() ; i++)
			System.out.println(listOne.get(i));*/
		
		/*for(Object obj : listOne){
			if(obj instanceof String)
				System.out.println("CollectionTest.main()" + obj);
			else if(obj instanceof CollectionTest){
				System.out.println("CollectionTest.main()" + ((CollectionTest)obj).callMe());
			}
		}*/
		/*for(String str : listOne){
			System.out.println(str);
		}
		System.out.println("=====================");
		Collections.sort(listOne);
		for(String str : listOne) {
			System.out.println(str);
		}*/
		
//		System.out.println("LinkedList.main() Before sort =" + listOne);
//		Collections.sort(listOne);
//		System.out.println("LinkedList.main() After Sort = " + listOne);
//		System.out.println("================================================");
		
		/*List<Person> list = new ArrayList<Person>();
		list.add(new Person("Jay","HYD","Soft"));
		list.add(new Person("Ajay","Ban","Hunter"));
		list.add(new Person("Rajeev","Ori","Govt"));
		list.add(new Person("Padma","Bari","Scientist"));*/
		
//		System.out.println("list of Persons before sorting = \n"+ list);
		
//		Collections.sort(list);
		
//		System.out.println("list of Persons After Normal sorting = \n"+ list);
//		
//		Collections.sort(list, new ProfSort());
//
//		System.out.println("list of Persons After Profession sorting = \n"+ list);
//		Collections.synchronizedList(list);
		
		/*Collections.synchronizedList(list);
		 */
		/*System.out.println("Before " +list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Person p = (Person)itr.next();
			if("Ajay".equals(p.getName()))
				itr.remove();
			System.out.println("CollectionTest.main()" + p);
		}
		
		System.out.println("After :"+list);*/
		
//		System.out.println("Before sorting");
//		for(Person per : list)
//			System.out.print(per);
//
//		Collections.sort(list);
//		
//		System.out.println("after sorting =================");
//		for(Person per : list)
//			System.out.print(per);
		Set<String> listOne = new HashSet<String>();
//		Set<String> listOne = new TreeSet<String>();
		listOne.add("ONE");
		listOne.add("ONE");
		listOne.add("TWO");
		listOne.add("AHREE");
		System.out.println(listOne);
	}
}
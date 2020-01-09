package collections;

import java.util.ArrayList;

public class ArrayLists {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		newList.add(67);
		newList.add(15);
		
//		// add all allows you to merge collections
//		list1.addAll(newList);
//		System.out.println(list1);
//		
//		// allows you to remove a value that is stored in one collection from another collection
//		list1.removeAll(newList);
//		
//		System.out.println(list1);
//		
//		// check if a list contains a value
//		boolean hasValue = list1.contains(67);
//		System.out.println(hasValue);
//		
//		//check if a list is empty
//		boolean isEmpty = list1.isEmpty();
//		System.out.println(isEmpty);
		
		//remove everything from one collection that does not exist in another collection
		list1.retainAll(newList);
		System.out.println(list1);
		
		
	}

}

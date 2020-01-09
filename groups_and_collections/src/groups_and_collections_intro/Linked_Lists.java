package groups_and_collections_intro;

import java.util.LinkedList;

public class Linked_Lists {

	public static void main(String[] args) {
		
//		must use the wrapper class as opposed to the primitive type.
//		eg. Integer rather than int
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(45);
		numbers.add(1000);
		numbers.remove();
		
		for (int number : numbers) {
			System.out.println(number);
		}

	}

}

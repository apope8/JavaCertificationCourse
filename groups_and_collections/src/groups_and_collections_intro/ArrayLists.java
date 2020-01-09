package groups_and_collections_intro;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		
//		Type not defined, items are added as objects
//		ArrayLists words = new ArrayLists();
//		
//		words.add("hello");
//		words.add("there");
//		words.add(0);
//		
////		Need to cast to a string
//		String item1 = (String) ((List<String>) words).get(0);

//		Defining a type
		
		ArrayList<String> words1 = new ArrayList<String>();
		
		words1.add("hello");
		words1.add("there");
		words1.add("10");
		
		String item2 = words1.get(2);
		
		System.out.println(item2);
		
	}

}

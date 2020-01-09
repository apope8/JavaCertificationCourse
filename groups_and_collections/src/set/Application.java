package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
//		HashLists remove duplicate values
		HashSet<Integer> values = new HashSet<Integer>();
		values.add(12);
		values.add(43);
		values.add(15);
		values.add(67);
		values.add(43);
		
		for (Integer value : values) {
			System.out.println(value);
		}
		
		HashSet<String> valueString = new HashSet<String>();
		valueString.add("Random");
		valueString.add("Animal");
		valueString.add("People");
		valueString.add("Random");
		valueString.add("Random");
		
		for (String value : valueString) {
			System.out.println(value);
		}
		
		System.out.println(".......");
//		LinkedHashSet keeps the order of the inserted values
		LinkedHashSet<String> linkString = new LinkedHashSet<String>();
		linkString.add("Random");
		linkString.add("Animal");
		linkString.add("People");
		linkString.add("Zoo");
		linkString.add("Random");
		
		for (String value : linkString) {
			System.out.println(value);
		}
		
//		using animal class
		System.out.println("........Animals...........");
		
		HashSet<Animals> animals = new HashSet<Animals>();
		
		Animals animals1 = new Animals("Dog", 12);
		Animals animals2 = new Animals("Cat", 8);
		Animals animals3 = new Animals("Bird", 3);
		Animals animals4 = new Animals("Dog", 12);
		Animals animals5 = new Animals("Kangaroo", 24);
		
		animals.add(animals1);
		animals.add(animals2);
		animals.add(animals3);
		animals.add(animals4);
		animals.add(animals5);
		
		for (Animals animal : animals) {
			System.out.println(animal);
		}

	}

}

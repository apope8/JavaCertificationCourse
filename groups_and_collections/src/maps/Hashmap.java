package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {

		// Hash map stores data in a key, value pair - no ordering - removes duplicates (keys)
		HashMap<String, String> dictionary = new HashMap<String, String>();
		// instead of add, we use put
		dictionary.put("Brave", "Ready to face and endure danger or pain; showing courage");
		dictionary.put("Brilliant", "exceptionally clever or talented");
		dictionary.put("Joy", "a feeling of great pleasure and happiness");
		dictionary.put("Confidence", "the state of feeling certain about the truth of something");

		// in order to iterate over the hash map you must invoke the keyset method
		for (String word : dictionary.keySet()) {
			//prints key
			System.out.println(word);
			//prints value
			System.out.println(dictionary.get(word));
			System.out.println("----------------------");
		}

		System.out.println(".............Linked................");
		// Linked Hash map stores data in a key, value pair - ordered
		LinkedHashMap<String, String> linkedDictionary = new LinkedHashMap<String, String>();
		// instead of add, we use put
		linkedDictionary.put("Brave", "Ready to face and endure danger or pain; showing courage");
		linkedDictionary.put("Brilliant", "exceptionally clever or talented");
		linkedDictionary.put("Joy", "a feeling of great pleasure and happiness");
		linkedDictionary.put("Confidence", "the state of feeling certain about the truth of something");

		// in order to iterate over the hash map you must invoke the keyset method
		for (String word : linkedDictionary.keySet()) {
			//prints key
			System.out.println(word);
			//prints value
			System.out.println(linkedDictionary.get(word));
			System.out.println("----------------------");
		}
		
		//to print both key and value together use entryset
		System.out.println("------entryset------");
		for(Map.Entry<String, String> entry : linkedDictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("-------next---------");
		}

	}

}

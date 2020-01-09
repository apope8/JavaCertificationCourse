package maps;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {

		// Treemap sorts by default - removes duplicates (keys)

		TreeMap<String, String> treeDictionary = new TreeMap<String, String>();

		treeDictionary.put("Brave", "Ready to face and endure danger or pain; showing courage");
		treeDictionary.put("Brilliant", "exceptionally clever or talented");
		treeDictionary.put("Joy", "a feeling of great pleasure and happiness");
		treeDictionary.put("Confidence", "the state of feeling certain about the truth of something");

		for (Map.Entry<String, String> entry : treeDictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}
	}

}

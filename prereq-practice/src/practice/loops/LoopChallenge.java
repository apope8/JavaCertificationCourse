package practice.loops;

public class LoopChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "We have a large inventory of things in our warehouse falling in "
				+ "the category: apparel and the slightly "
				+ "more in demand category: makeup along with the category: furniture and ...";
		
		printCategories(str);

	}

	/**
	 * extract all categories from the string argument
	 * @param str
	 */
	private static void printCategories(String str) {
		// TODO Auto-generated method stub
		
		int index = 0;
		while (true) {
			int found = str.indexOf("category: ", index);
			if (found == -1) break;
			int start =  found + 10; //"category: ": is 9 characters - 10th character is the start of the actual category
			int end = str.indexOf(" ", start); //starts at the start index and stops at a space
			System.out.println(str.substring(start, end));
			index = end + 1;
			
		}
		
	}

}

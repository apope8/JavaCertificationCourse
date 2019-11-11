package practice.loops;

public class ForLoopPractice {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println("i: " + i); // prints 0 - 99
//		}
		
		String name = "dfghjkzsodiuyagd";
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println("char: " + name.charAt(i)); // Iterates through each character in the string
		}

	}

}

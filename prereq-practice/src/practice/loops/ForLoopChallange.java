package practice.loops;

public class ForLoopChallange {

	public static void main(String[] args) {
		// Print characters backwards
		
		String name = "dfghjkzsodiuyagd";
		
		for (int i = name.length()-1; i >= 0; i--) {
			System.out.println("char: " + name.charAt(i)); // Iterates through each character in the string
		}
		
		
		// print all the numbers that are even between 0 - 100
		
		for (int i = 0; i <= 100; i++) {
			while(i % 2 == 0 ) {
				System.out.println(i);
				i++;
			}
		}
		
		//alternative method
		
		for (int i = 0; i <=  100; i+=2) { // i = i +2
			System.out.println(i);
			
		}

	}

}

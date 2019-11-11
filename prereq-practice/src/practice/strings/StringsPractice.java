package practice.strings;

public class StringsPractice {

	public static void main(String[] args) {
		// Substring
		
		String str = "ABCDEF";
		str.length();
		String extractedString = str.substring(1); // characters start at 0
		String partString = str.substring(3, 6);
		
		System.out.println(extractedString);
		System.out.println(partString);
		
//		Comparable
		String a = "hello";
		String b = "there";
		
		if(a== "hello") {
//			THIS IS A TRAP, DONT DO THIS!!!!
		}
		
//		Correct method to compare strings
		if(a.equals("hello")) {
			//Use this as Strings unlike integers are objects
		}
		
		if(b.equals("there")) {
			System.out.println("printed there");
		}
		
		if(b.equals("There")) {
			//This will fail, capital T
		}
		
		if(b.equalsIgnoreCase("There")) {
			System.out.println("This will print fine as case is being ignored");
		}
	
		//Characters
		System.out.println(a.charAt(3));
		System.out.println(a.charAt(4));
//		System.out.println(a.charAt(13)); //Error String index out of range
//		System.out.println(a.charAt(-6)); //Error String index out of range
		
		//Find index within a string
		
		String str1 = "Hello there yogi";
		
		int e = str1.indexOf("there");
		
		System.out.println(e);
		
		String str2 = "Hello there yogi there";
		//State start position where you would like the program to look in the string. Reads from left to right
		
		int f = str2.indexOf("there", 7);
		
		// if 0 is passed in the first instance will be returned
		
		int g = str2.indexOf("there", 0);

		
		System.out.println(f);
		System.out.println(g);
		
		
		//last index - searches right to left but index still run left to right
		
		int h = str2.lastIndexOf("yogi");
		System.out.println(h);
	}
	
}

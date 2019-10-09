package java_basics;

public class LearningMethods {
	

	/*
	 * public -
	 * static -
	 * void - 
	 * main -
	 */
	public static void main(String[] args) {
		System.out.println("System Out Example");
		MyUtils.printSomeJunk("This is some data");
		System.out.println(MyUtils.printSomeJunk(62));
		MyUtils.someTwoNumbers(10, 23);
		int myVar = MyUtils.add10(99);
		System.out.println(myVar);
		System.out.println(myVar + 26);
	}
	
	

}

package java_basics;

public class MyUtils {
	
	//nothing returned from void
	public static void printSomeJunk(String argument) {
		System.out.println("String passed in " + argument);
	}
	
	public static void printSomeJunk(int argument) {
		System.out.println("Integer passed in " + argument);
	}
	
	public static void someTwoNumbers(int firstArg, int secondArg) {
		System.out.println(firstArg + secondArg);
	}
	
	public int add10(int someArgument) {
		int result =someArgument + 10;
		return result;
	}
}

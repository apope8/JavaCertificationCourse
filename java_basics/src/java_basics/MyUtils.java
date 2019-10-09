package java_basics;

public class MyUtils {
	
	//nothing returned from void
	public static void printSomeJunk(String argument) {
		System.out.println("String passed in " + argument);
	}
	
	public static int printSomeJunk(int argument) {
		return argument;
	}
	
	public static void someTwoNumbers(int firstArg, int secondArg) {
		System.out.println(firstArg + secondArg);
	}
	
	public static int add10(int someArgument) {
		int result =someArgument + 10;
		return result;
	}
}

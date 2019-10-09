package java_basics;

public class VariablesContinued {

	public static void main(String[] args) {
		int var = 10000000; //two to the 31st power, 32 bit
		long bigNumber = 1000000000000L; //Long allows you to store larger numbers. Must end in L so it overrides the int limit
//		long should only be used only when the figure is longer then the limit imposed by int. When using Long the program reserves
//		all the memory for long instead of just the figures used
		
		short smallNumber = 3276;  // short is more efficient than int. It can store a figure up to 3276
		
		byte reallySmallNumber = 127; // Shorter again is byte. It can store a figure of up to 127
		
		double decimalNumber = 394.003; //Allows storage of decimal points
		
		boolean decision = true; //Boolean allows only two responses 'true' or 'false'
		
		char letter = 'a'; //Allows the storage of a single character only
		
		

	}

}

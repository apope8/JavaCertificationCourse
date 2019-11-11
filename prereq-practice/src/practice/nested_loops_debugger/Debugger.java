package practice.nested_loops_debugger;

public class Debugger {

	public static void main(String[] args) {
		//set breakpoint at counter - double click grey space
		int counter = 0;
		
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			int temp  = counter + 1;
			counter = temp;
		}
		
		//f6 to step over code

	}

}

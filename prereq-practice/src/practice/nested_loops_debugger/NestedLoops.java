package practice.nested_loops_debugger;

public class NestedLoops {

	public static void main(String[] args) {
		for (int idx = 0; idx < 100; idx++) { // Outer loop
			for (int j = 0; j < 10; j++) { // inner loop
				System.out.println("the value of idx was: " + idx + " ------- " + j);
				
//				for every iteration of the outer loop the inner loop will run also
//				example when the outer loop runs once the inner loop will run 10 times
//				e.g. 1 will print 10 times, 2 will print 10 times, etc etc
//				View from the most inner loop outwards
			}
		}

	}

}

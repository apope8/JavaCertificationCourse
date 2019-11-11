package practice.loops;

public class LoopsPractice {

	public static void main(String[] args) {
		
//		While loop - while something is true run something.
		
		int count = 0;
		
		//infinite loop - count is not being updated
//		while (count <= 100) {
//			System.out.println("Aaron");
//		}
		
		
		while (count <= 100) {
			System.out.println("Aaron: " + count);
			count = count + 1; //count will increment by 1 after each loop until it 
//								reaches 100, will print Aaron 100 times
			
//			break; //stops loop immediately
			
			if(count == 30) {
				break;
			}
		}

	}

}

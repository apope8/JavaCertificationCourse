package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		int[] values = new int[100]; //Initialize the array with 100 slots. Arrays allow you to store multiple datapoints in one variable
		values[2] = 1000; //Inserts the value 1000 into the second index (slot) of the array
		values[0] = 392; // Arrays begin at 0
		values[99] = 9082; // Arrays ends at size -1
//		values[1] = "String"; // Cannot store a string in an int array. Arrays are type specific
		
		System.out.println(values[1]);  //print value at the second slot. If a slot hasnt been assigned a value. Automatically set to 0
		System.out.println(values[0]); 
		System.out.println(values[99]);  
//		System.out.println(values[100]); // Cannot print a value outside of the array range. As arrays start at 0 the last slot is at index 99 
		
		String[] words = new String[] {"My", "name", "is"}; //You can assign values to the array directly
		
		System.out.println(words[2]);
	}

}

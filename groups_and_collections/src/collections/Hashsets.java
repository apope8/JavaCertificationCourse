package collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Hashsets {

	public static void main(String[] args) {
		
		// Hashset removes duplicates
		HashSet<Integer> hashset = new HashSet<Integer>();
		hashset.add(12);
		hashset.add(43);
		hashset.add(15);
		hashset.add(67);
		hashset.add(43);
		hashset.add(10);
		hashset.add(10);
		hashset.add(10);
		hashset.add(10);
		hashset.add(10);
		
		
		
		// convert hashset into list
		List<Integer> li = new ArrayList<Integer>(hashset);
		System.out.println(li);
		
		//One reason to convert to a list is to run the sort method from collections which will only accept lists
		Collections.sort(li);
		System.out.println(li);
		
		
		//Same example with a string
		HashSet<String> hashsetString = new HashSet<String>();
		hashsetString.add("Random");
		hashsetString.add("Tooth Brush");
		hashsetString.add("Computer");
		hashsetString.add("Clothes");
		
		List<String> liString = new ArrayList<String>(hashsetString);
		System.out.println(liString);
		
		Collections.sort(liString);
		System.out.println(liString);
		
		
		//Using external class
		
		HashSet<EmployeeCompareTo> hsEmployees = new HashSet<EmployeeCompareTo>();
		hsEmployees.add(new EmployeeCompareTo("Mike", 3500, "Accounting"));
		hsEmployees.add(new EmployeeCompareTo("Paul", 3000, "Admin"));
		hsEmployees.add(new EmployeeCompareTo("Peter", 5000, "IT"));
		hsEmployees.add(new EmployeeCompareTo("Aaron", 2000, "Maint"));
		
		//before sorting there must be a comparable method implemeted in the employee class
		ArrayList<EmployeeCompareTo> emplList = new ArrayList<EmployeeCompareTo>(hsEmployees);
		Collections.sort(emplList);
		System.out.println(emplList);
		
		
	}

}

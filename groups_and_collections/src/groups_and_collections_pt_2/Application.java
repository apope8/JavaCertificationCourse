package groups_and_collections_pt_2;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		ArrayList<String> animals  = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		
		//Iterate method 1
		System.out.println("Traditional Loop");
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		System.out.println("----------------");
		
		//Iterate method 2 - for each
		System.out.println("Enhanced For Each Loop Animals");
		for (String value : animals) {
			System.out.println(value);
		}
		
		System.out.println(" ");
		System.out.println("Array List");
		System.out.println("----------------");
		System.out.println("Enhanced For Each Loop Cars");
		System.out.println("----------------");

		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		Vehicle vehicle2 = new Vehicle("Toyota", "camrey", 15000, false);
		
		vehicles.add(new Vehicle("Honda", "accord", 12000, false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));
		
		for(Vehicle car : vehicles) {
			System.out.println(car.getMake());
			System.out.println(car.getModel());
			System.out.println(car.getPrice());
			System.out.println("----------------");
			System.out.println("------To String Method----------");
			System.out.println(car.toString());
			System.out.println("----------------");
		}
		
		System.out.println(" ");
		System.out.println("Linked List");
		System.out.println("----------------");
		System.out.println("Enhanced For Each Loop Cars");
		System.out.println("----------------");

		
		LinkedList<Vehicle> vehicles1 = new LinkedList<Vehicle>();
		
		Vehicle vehicle21 = new Vehicle("Toyota", "camrey", 15000, false);
		
		vehicles1.add(new Vehicle("Honda", "accord", 12000, false));
		vehicles1.add(vehicle21);
		vehicles1.add(new Vehicle("Jeep", "Wrangler", 25000, true));
		
		for(Vehicle car : vehicles1) {
			System.out.println(car.getMake());
			System.out.println(car.getModel());
			System.out.println(car.getPrice());
			System.out.println("----------------");
			System.out.println("------To String Method----------");
			System.out.println(car.toString());
			System.out.println("----------------");
		}
		
		printElements(vehicles1);
	}
	
	public static void printElements(List someList) {
		for (int i = 0; i < someList.size(); i++) {
			System.out.println("Itterate print list");
			System.out.println(i);
			System.out.println("----");
		}
	}

}

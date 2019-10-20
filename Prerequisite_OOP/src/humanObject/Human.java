package humanObject;

public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyeColour;
	
	//Hard coded constructor
	public Human() {
		age = 5;
		eyeColour = "brown";
		heightInInches = 72;
		name = "Tom Zsabo";
	}
	
	
	//Constructor that expects user to enter the values for each field
	public Human(String name, int age, int heightInInches, String eyeColour) {
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColour = eyeColour;
	}



	public void speak() {
		System.out.println("Hello my name is " + name);
		System.out.println("I am " + heightInInches + " inches tall");
		System.out.println("I am " + age + " years old");
		System.out.println("My eye colour is " + eyeColour);
	}
	
	public void eat() {
		System.out.println("eating.....");
	}
	
	public void walk() {
		System.out.println("walking.....");
	}
	
	public void work() {
		System.out.println("working.....");
	}
	
}

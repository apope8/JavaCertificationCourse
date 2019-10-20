package animal;

//For inheritance this is the parent class - super class - base class 
public abstract class Animal {
	
	int age;
	String gender;
	int weightInLbs
	;

	
	public Animal(int age2, String gender2, int weightInLbs2) {
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}

	public void eat() {
		System.out.println("eating .......");
	}
	
	public void sleep() {
		System.out.println("sleeping .......");
	}
	
	//abstract class. No instructions. Child classes can use method as needed
	public abstract void move();

}

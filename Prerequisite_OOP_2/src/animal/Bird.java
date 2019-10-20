package animal;

//For inheritance this is the child class
public class Bird extends Animal {
	
	
	
	public Bird(int age2, String gender2, int weightInLbs2) {
		// calling the constructor from the parent class
		super(age2, gender2, weightInLbs2);
	}

	@Override
	public void move() {
		System.out.println("Flapping wings");
	}

}

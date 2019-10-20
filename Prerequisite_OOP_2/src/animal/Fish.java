package animal;

// extend requires all methods from the parent class to be implemented
public class Fish extends Animal {
	
	public Fish(int age2, String gender2, int weightInLbs2) {
		super(age2, gender2, weightInLbs2);
	}

	public void swim() {
		System.out.println("Swimming......");
	}

	@Override
	public void move() {
		System.out.println("Fish is swimming....");
		
	}

}

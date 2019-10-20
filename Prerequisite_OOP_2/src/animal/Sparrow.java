package animal;

//Classes can only extend one other class, it can have as many interfaces as needed
public class Sparrow extends Bird implements Flyable {

	public Sparrow(int age2, String gender2, int weightInLbs2) {
		super(age2, gender2, weightInLbs2);
	}

	@Override
	public void fly() {
		System.out.println("Sparrow flying high....");
		
	}
	
	

}

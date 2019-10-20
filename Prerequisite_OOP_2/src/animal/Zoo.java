package animal;

public class Zoo {
	
	public static void main(String args[]) {
		
//		Animal animal1 = new Animal(12, "M", 23);
//		animal1.eat();
		
		Bird bird1 = new Bird(3,"F", 10);
		bird1.eat();
		bird1.sleep();
		
		Fish fish1 = new Fish(1,"M", 1);
		fish1.swim();
		//cannot use variables defined in separate local classes 
//		fish1.fly();
		
//		Chicken chick1 = new Chicken(1, "F", 2);
		
//		chick1.fly();
		
		Sparrow sparrow1 = new Sparrow(1, "M", 4);
		sparrow1.move();
		
		Fish fish2 = new Fish(1, "M", 4);
		fish2.move();
		
		//Possible through abstract classes. However can only use methods from the abstract class
		Animal sparrow2 = new Sparrow(1, "M", 4);
		sparrow2.move();
		
		Animal fish3 = new Fish(1, "M", 4);
		fish3.move();
		
		Animal fisAnimal = new Fish(1, "M", 4);
		fish1.move();
		
		moveAnimal(fisAnimal);
		
		moveAnimal(sparrow2);
		
		// Call method from the interface
		Flyable flyingBird = new Sparrow(1, "m", 5);
		
		flyingBird.fly();

	}
	
	// Polymorphism
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}

package humanObject;

public class Earth {
	
	//Before Constructor - constructor was empty
//	public static void main(String args[]) {
//		
//		Human tom;
//		tom = new Human();
//		tom.age = 5;
//		tom.eyeColour = "brown";
//		tom.heightInInches = 72;
//		tom.name = "Tom Zsabo";
//		
//		tom.speak();
//		
//		System.out.println("..................");
//		
//		Human joe = new Human();
//		
//		joe.age = 36;
//		joe.eyeColour = "blue";
//		joe.heightInInches = 102;
//		joe.name = "Joe Doyle";
//		
//		joe.speak();
//		
//		
//	}
	
	//After Constructor is populated with hard coded values
//	public static void main(String args[]) {
//		Human human1 = new Human();
//		Human human2 = new Human();
//		Human human3 = new Human();
//		
//		human1.speak();
//		System.out.println("..................");
//		human2.speak();
//		System.out.println("..................");
//		human3.speak();
//		
//	}
	
	//After constructor is populated using fields
	public static void main(String args[]) {
		Human human1 = new Human("Tom", 25, 76, "Blue");
		Human human2 = new Human("Joe", 28, 68, "green");

		
		human1.speak();
		System.out.println("..................");
		human2.speak();
	}
}

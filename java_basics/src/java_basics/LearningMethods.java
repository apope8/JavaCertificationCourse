package java_basics;

import someOtherPackage.ExampleClass;

public class LearningMethods {

	/*
	 * public - allows to be used over different classes private - can only be used
	 * in the same class static - Belongs to this class - e.g. not inherited - must
	 * be invoked as a instance void - does not return anything main -
	 */
	public static void main(String[] args) {
		System.out.println("System Out Example");
		MyUtils.printSomeJunk("This is some data");
		MyUtils.printSomeJunk(62);
		MyUtils.someTwoNumbers(10, 23);
//		int myVar = MyUtils.add10(99);
//		System.out.println(myVar);
//		System.out.println(myVar + 26);
		ExampleClass.doSomething();

		// Static examples

		// Classes as data types - instance - object variable "myVar"
		MyUtils myVar = new MyUtils();

		// static must be called from the class
		MyUtils.printSomeJunk(20);

		// non static can be called from the variable
		myVar.add10(20);

	}

}

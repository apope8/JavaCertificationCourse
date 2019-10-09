package someOtherPackage;

import java_basics.MyUtils;

public class ExampleClass {
	
	//We can only see my utils in this package because the class is public. 
	//If not the class will only be visible within the same package
	public static void doSomething() {
		MyUtils.printSomeJunk(87);
	}
}

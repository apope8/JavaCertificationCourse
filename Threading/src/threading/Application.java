package threading;

public class Application {

	public static void main(String args[]) {
		
		Task taskRunner = new Task();
		taskRunner.start();
		
		//Multi threaded programme. Once we invoke start() java does not wait for the task to finish before moving onto the next task
		
		System.out.println("hello there...");
		
		//You can run different instances of the same task by declaring the task again
		
		Task taskRunner2 = new Task();
		taskRunner2.start();
	}
	
}

class Task extends Thread{
	
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("number: " + i);
		}
	}
}

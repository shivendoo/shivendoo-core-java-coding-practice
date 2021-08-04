package multiThreadPrograms;

public class HelloRunnableInterfaceClass extends TestSupreClass implements Runnable {

	public void printHello() {
		for (int i = 0; i < 10; i++) {
			System.out.println("HELLO");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
	
	public void run () {
		printHello();
	}
}

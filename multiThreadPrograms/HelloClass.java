package multiThreadPrograms;

public class HelloClass extends Thread {

	public void printHello() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
	
	public void run () {
		printHello();
	}
}
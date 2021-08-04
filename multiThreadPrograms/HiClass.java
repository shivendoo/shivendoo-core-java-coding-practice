package multiThreadPrograms;

public class HiClass extends Thread {

	public void printHi() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hi");
			//try{Thread.sleep(500);}catch(Exception e){}
		}
	}

	public void run() {
		printHi();
	}
}

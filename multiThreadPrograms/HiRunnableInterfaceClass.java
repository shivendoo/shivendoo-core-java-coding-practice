package multiThreadPrograms;

public class HiRunnableInterfaceClass extends TestSupreClass implements Runnable{
	
	public void printHi() {
		for (int i = 0; i < 10; i++) {
			System.out.println("HI");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}

	public void run() {
		printHi();
	}
	
}

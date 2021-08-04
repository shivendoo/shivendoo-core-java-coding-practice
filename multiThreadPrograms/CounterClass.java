package multiThreadPrograms;

public class CounterClass {

	private static int count; 
	
	public synchronized void  incrementCounter() {
		count++;
	}
	
	public int getCounter() {
		return count;
	}
	
}

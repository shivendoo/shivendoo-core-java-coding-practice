package multiThreadPrograms;


public class SharedResouce {

	// suppose thread can only access

	int num;
	boolean setValue = false;

	public synchronized void printNum(int num) {
		while (setValue == true) {
			try {
				wait();
			} catch (Exception e) {	}
		}
		
		this.num = num;
		setValue = true;
		notify();
		System.out.println("Write :" + num);
	}

	public synchronized void readNum() {		
		while (setValue == false) {
			try {
				wait();
			} catch (Exception e) {	}
		}
		System.out.println("Read : " + num);
		setValue = false;
		notify();
	}

}

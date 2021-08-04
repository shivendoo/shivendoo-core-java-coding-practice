package multiThreadPrograms;

public class ConsumerThread implements Runnable{

	SharedResouce res;

	public ConsumerThread(SharedResouce res) {
		super();
		this.res = res;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}
	
	public void run() {
		
		while(true) {
			res.readNum();
			try {Thread.sleep(500);}catch(Exception e ) {}
		}
		
	}

	
}

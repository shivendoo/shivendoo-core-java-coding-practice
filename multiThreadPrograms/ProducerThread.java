package multiThreadPrograms;

public class ProducerThread implements Runnable {

	SharedResouce resource;

	public ProducerThread(SharedResouce resource) {
		this.resource = resource;
		Thread t1 = new Thread(this, "Producer");
		t1.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			resource.printNum(i++);
			try {Thread.sleep(1000);}catch(Exception e ) {}
		}
	}

}

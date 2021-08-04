package multiThreadPrograms;

public class ConsumerProducerRunner {

	public static void main(String[] args) {
		
		SharedResouce test = new SharedResouce();
		new ProducerThread(test);
		new ConsumerThread(test);

	}

}

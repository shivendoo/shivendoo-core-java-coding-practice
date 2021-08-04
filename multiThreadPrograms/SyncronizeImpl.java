package multiThreadPrograms;

public class SyncronizeImpl {

	public static void main(String[] args) {

		CounterClass obj = new CounterClass();

		Runnable run1 = () -> {
			for (int i = 0; i < 1000; i++)
				obj.incrementCounter();
		};
		Runnable run2 = () -> {
			for (int i = 0; i < 1000; i++)
				obj.incrementCounter();
		};

		Thread first = new Thread(run1);
		Thread second = new Thread(run2);

		first.start();
		second.start();
		try {
        first.join();
        second.join();
        }catch(Exception ex) {}
		System.out.println(obj.getCounter());

	}

}

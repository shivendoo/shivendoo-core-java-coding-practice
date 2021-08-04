package queueDataStructur;

public class QueueRunner {

	public static void main(String[] args) {

		QueueImp queue = new QueueImp(2);
		queue.enQueue(15);
		queue.enQueue(78);
		queue.enQueue(58);
		queue.show();
		queue.enQueue(34);
		queue.enQueue(28);
		queue.show();
		queue.deQueue();
		queue.show();

	}

}

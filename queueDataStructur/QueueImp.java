package queueDataStructur;

public class QueueImp {

	private int size;
	private int queue[];
	int rear;
	int front;
	int numofElement;

	public QueueImp(int size) {
		super();
		this.size = size;
		queue = new int[size];
	}

	public QueueImp() {
		super();
		this.size = 5;
		queue = new int[5];
	}

	// inserting elemnet in queue

	public boolean enQueue(int num) {
		if (isFull()) {
			System.out.println("Queue is full ");
			return false;
		} else {
			queue[rear] = num;
			rear = (rear + 1) % (size);
			numofElement++;
			return true;
		}
	}

	// removing element from queue
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty ");
			return 0;
		} else {
			int data = queue[front];
			front = (front + 1) % (size);
			numofElement--;
			System.out.println("deleted " + data);
			return data;
		}
	}

	// Print Qeue
	public void show() {
		if (numofElement == 0)
			System.out.println("Queue is empty");
		else {
			System.out.print("Element in queue is : ");
			for (int i = 0; i < numofElement; i++) {
				System.out.print(" " + queue[(i+rear)%numofElement]);
			}
			System.out.println("");
		}
	}

	private boolean isFull() {
		if (size == numofElement)
			return true;
		else
			return false;
	}

	private boolean isEmpty() {
		if (numofElement == 0)
			return true;
		else
			return false;

	}
}

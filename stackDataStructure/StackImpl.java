package stackDataStructure;

public class StackImpl {

	private int MaxSize;
	private int stack[]; // = new int[MaxSize];
	private int top = 0;
	private int stackSize = 0;

	// construct with parameter 
	public StackImpl(int maxSize) {
		super();
		MaxSize = maxSize;
		stack = new int[maxSize];
	}

	// default consturctor
	public StackImpl() {
		super();
		MaxSize = 6;
		stack = new int[6];
	}

	// Insert element in stack 
	public boolean push(int item) {
		if (isFull()) {
			System.out.println("Stack is full");
			return false;
		}
		stack[top] = item;
		top++;
		return true;
	}

	// remove top element from stack
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
		} else {
			top--;
			return stack[top];
		}

	}

	// show top element in stack 
	public void peek() {
		System.out.println("Element on top of stack is : " + stack[top - 1]);
	}

	 // true if stack is empty 
	private boolean isEmpty() {
		if (top <= 0)
			return true;
		else
			return false;
	}

	// true if stack is full 
	private boolean isFull() {
		if (top >= MaxSize)
			return true;
		else
			return false;
	}

	// print element of stack
	void showStack() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return;
		} else {
			System.out.print(" Stack elemet is : ");
			// for (int data : stack) {
			for (int i = 0; i < top; i++) {
				System.out.print(stack[i] + " ");
			}
		}
		System.out.println(" ");
	}
	
	// show/print number of element in stack
	public int size() {
		System.out.println("Size of Array is :"+top);
		return top ;
	}

}

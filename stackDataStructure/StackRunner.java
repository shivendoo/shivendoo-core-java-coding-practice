package stackDataStructure;

public class StackRunner {

	public static void main(String[] args) {
		
		StackImpl stack = new StackImpl(6);
		stack.pop();
		stack.push(16);
		stack.push(78);
		stack.push(24);
		stack.push(12);
		stack.push(80);
		stack.push(67);
		stack.push(30);
		stack.push(97);
		stack.peek();
		stack.size();
		stack.showStack();	
		stack.pop();
		stack.showStack();	
		stack.size();
	}

}

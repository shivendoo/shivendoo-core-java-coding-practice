package doubleLinkedListDataStructure;

public class LinkListImpl {

	private DoubleLinkedListNode firstNode = null;
	int numberOfNodes;
	// size of link list

	int Size() {
		return numberOfNodes;
	}

	// Insert node at
	public void InsertNode(int value) {
		InsertAtLast(value);		
//		DoubleLinkedListNode node = new DoubleLinkedListNode();
//		node.setData(value);
//		node.setNextNode(null);
//		DoubleLinkedListNode tempNode = firstNode;
//		if (firstNode == null) {
//			node.setPreviosNode(null);
//			node.setNextNode(null);
//			firstNode = node;
//		} else {
//			while (tempNode.getNextNode() != null) {
//				tempNode = tempNode.getNextNode();
//			}
//			tempNode.setNextNode(node);
//			node.setPreviosNode(tempNode);
//			// node.setNextNode(null);
//		}
//		numberOfNodes++;
//		System.out.println("New Element " + value + " Added in Linked List");
	}

	// Insert node at last
	public void InsertAtLast(int value) {
		DoubleLinkedListNode node = new DoubleLinkedListNode();
		node.setData(value);
		node.setNextNode(null);
		DoubleLinkedListNode tempNode = firstNode;
		// if linked list is empty
		if (firstNode == null) {
			node.setPreviosNode(null);
			node.setNextNode(null);
			firstNode = node;
		} else { // if link list is NOT empty
			while (tempNode.getNextNode() != null) {
				tempNode = tempNode.getNextNode();
			}
			tempNode.setNextNode(node);
			node.setPreviosNode(tempNode);
		}
		numberOfNodes++;
		System.out.println("New Element " + value + " Added at END of Linked List");
	}

	// Insert node at Start
	public void InsertAtStart(int value) {
		DoubleLinkedListNode node = new DoubleLinkedListNode();
		node.setData(value);
		node.setPreviosNode(null);
		node.setNextNode(firstNode);
		firstNode = node;
		numberOfNodes++;
		System.out.println("New Element " + value + " Added at Start of Linked List");
	}

	// Insert Element at specific index in linked list
	public boolean insertNodeAtIndex(int value, int index) {
		DoubleLinkedListNode node = new DoubleLinkedListNode();
		node.setData(value);
		if(index > numberOfNodes-1 ) {
			System.out.println("");
			System.out.println("Index is out of range, node in not inserted");
		return false;	
		}

		if (index == 0) {
			InsertAtStart(value);
			numberOfNodes++;
			System.out.println("New Element " + value + " Added at Start of Linked List");
			return true;

		}

		if (index == numberOfNodes) {
			InsertAtLast(value);
			numberOfNodes++;
			System.out.println("New Element " + value + " Added at Start of Linked List");
			return true;

		}

		if (numberOfNodes > index) {
			DoubleLinkedListNode tempNode = firstNode;
			for (int num = 0; num < index - 1; num++) {
				tempNode = tempNode.getNextNode();
			}

			node.setPreviosNode(tempNode);
			node.setNextNode(tempNode.getNextNode());
			tempNode.setNextNode(node);
			numberOfNodes++;
			System.out.println("New Element " + value + " Added at Start of Linked List");
			return true;
		}

		System.out.println("no new element added");
		return false;
	}

	// iterate and print all element of linked list

	public void printList() {
		DoubleLinkedListNode tempNode = firstNode;
		if (tempNode == null) {
			System.out.println("Linked List is empty");
		} else {
			System.out.print("Linked List Element : ");
			while (tempNode != null) {
				System.out.print(tempNode.getData());
				System.out.print(" ");
				tempNode = tempNode.getNextNode();
			}
		}
	}
}

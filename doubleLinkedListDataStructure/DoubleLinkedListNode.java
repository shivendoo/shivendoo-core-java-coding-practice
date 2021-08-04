package doubleLinkedListDataStructure;

public class DoubleLinkedListNode  {

	private DoubleLinkedListNode PreviosNode = null;
	private DoubleLinkedListNode NextNode = null;
	private int data ; 
	
	
	public DoubleLinkedListNode getPreviosNode() {
		return PreviosNode;
	}
	public void setPreviosNode(DoubleLinkedListNode previosNode) {
		PreviosNode = previosNode;
	}
	public DoubleLinkedListNode getNextNode() {
		return NextNode;
	}
	public void setNextNode(DoubleLinkedListNode nextNode) {
		NextNode = nextNode;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	

	
}

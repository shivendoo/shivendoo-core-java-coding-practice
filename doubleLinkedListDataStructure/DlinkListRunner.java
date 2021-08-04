package doubleLinkedListDataStructure;

public class DlinkListRunner {

	public static void main(String[] args) {
		
		LinkListImpl list = new LinkListImpl();
		
		list.InsertNode(10);
		list.InsertNode(15);
		list.InsertNode(17);
		list.InsertNode(22);
		list.InsertNode(54);
		list.InsertNode(74);
		list.InsertAtLast(678);
		list.InsertNode(94);
		list.InsertNode(34);
		list.InsertAtStart(55);
		list.printList();
		list.insertNodeAtIndex(2, 44);
		System.out.println("SIze of list is : "+list.Size());		
		list.printList();
		
	}

}

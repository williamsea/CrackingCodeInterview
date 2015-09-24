package Ch3.StacksAndQueues;
//SinglyLinkedList
public class Node {
	Node next = null;
	Object data;
	
	public Node(Object item){
		data = item;
	}
	
	void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}

}

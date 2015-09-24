package Ch3.StacksAndQueues;

public class Queue {
	Node first, last;
	
	void enqueue(Object item){
		if(first == null){
			last = new Node(item);
			first = last;
		}
		else{
			last.next = new Node(item);
			last = last.next;
		}
	}
	
	Object dequeue(){
		if(first == null){
			last = null;//empty queue
			return null;
		}
		else{
			Object item = first.data;
			first = first.next;
			return item;
		}
	}
}

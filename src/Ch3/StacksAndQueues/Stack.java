package Ch3.StacksAndQueues;

public class Stack {
	Node top;
	
	Object pop(){
		if(top!=null){
			Object item = top.data;
			top = top.next;
			return item;
		}
		return null;
	}
	
	void push(Object item){
		Node t = new Node(item);
		t.next = top;
		top = t;
	}
	
	Object peek(){
		return top.data;
	}
}

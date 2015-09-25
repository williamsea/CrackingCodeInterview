package Ch3.StacksAndQueues;

public class Ch3_2_Stackmin {
	Node top;
	Object min;
	
	Object pop(){
		if(top!=null){
			Object item = top.data;
			top = top.next;
			return item;
		}
		return null;
	}
	
	void push(Object item){
		if(min == null){
			min = item;
		}
		else{
			if((int)item<(int)min){
				min = item;
			}
		}	
		
		Node t = new Node(item);
		t.next = top;
		top = t;
	}
	
	Object peek(){
		return top.data;
	}
	
	Object min(){
		return min;
	}
}

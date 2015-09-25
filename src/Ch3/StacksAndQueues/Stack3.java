package Ch3.StacksAndQueues;

public class Stack3 {
	private int capacity;
	public Node top, buttom;
	public int size = 0;
	
	public Stack3(int capacity){
		this.capacity = capacity;
	}
	
	public boolean isFull(){
		return size == capacity;
	}
	
	public boolean push(int v){
		return true;
	}
	
	public int pop(){
		return 0;
	}
	
	public boolean isEmpty(){
		return false;
	}
}

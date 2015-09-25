package Ch3.StacksAndQueues;

import java.util.ArrayList;

public class Ch3_3_SetOfStacks {//This code is not running, Stack3 has only frame
	ArrayList<Stack3> stacks = new ArrayList<Stack3>();
	public int capacity;
	
	public Ch3_3_SetOfStacks(int capacity){
		this.capacity = capacity;
	}
	
	public Stack3 getLastStack(){
		if(stacks.size()==0){
			return null;
		}
		return stacks.get(stacks.size()-1);
	}
	
	public void push(int v){
		Stack3 last = getLastStack();
		if(last != null && !last.isFull()){
			last.push(v);
		}
		else{
			Stack3 stack = new Stack3(capacity);
			stack.push(v);
			stacks.add(stack);
		}
	}
	
	public int pop(){
		Stack3 last = getLastStack();
		int v = last.pop();
		if(last.size == 0){
			stacks.remove(stacks.size()-1);
		}
		return v;
	}
	
	public boolean isEmpty(){
		Stack3 last = getLastStack();
		return last==null || last.isEmpty();
	}
	
}

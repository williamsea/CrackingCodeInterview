package Ch3.StacksAndQueues;

import java.util.Stack;

public class Ch3_5_MyQueue<T> {//Implemented by two stacks
	Stack<T> values, temp;
	
	public Ch3_5_MyQueue(){
		values = new Stack<T>();
		temp = new Stack<T>();
	}
	
	private void shiftStacks(){
		if(values.isEmpty()){ // IMPORTANT. Use up the values stack first, before adding new elements from temp
			while(!temp.isEmpty()){
				values.push(temp.pop());//move elements from newStack to OldStack
			}
		}
	}
	
	public void push(T t){
		temp.push(t);
	}
	
	public T pop(){
		shiftStacks();
		return values.pop();
	}
	
	public T peek(){
		shiftStacks();
		return values.peek();
	}
	
	public static void main(String[] args){
		Ch3_5_MyQueue<Integer> MyQueue = new Ch3_5_MyQueue<Integer>();
		MyQueue.push(1);
		MyQueue.push(2);
		MyQueue.push(3);
		System.out.print(MyQueue.pop());
		System.out.print(MyQueue.pop());
		System.out.print(MyQueue.pop());	
	}
	
}

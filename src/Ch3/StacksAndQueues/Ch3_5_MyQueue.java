package Ch3.StacksAndQueues;

import java.util.Stack;

public class Ch3_5_MyQueue<T> {//Implemented by two stacks
	Stack<T> oldStack, newStack;
	
	public Ch3_5_MyQueue(){
		oldStack = new Stack<T>();
		newStack = new Stack<T>();
	}
	
	private void shiftStacks(){
		if(oldStack.isEmpty()){
			while(!newStack.isEmpty()){
				oldStack.push(newStack.pop());//move elements from newStack to OldStack
			}
		}
	}
	
	public void push(T t){
		newStack.push(t);
	}
	
	public T pop(){
		shiftStacks();
		return oldStack.pop();
	}
	
	public T peek(){
		shiftStacks();
		return oldStack.peek();
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

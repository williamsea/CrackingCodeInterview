package Ch3.StacksAndQueues;

import java.util.Stack;

public class Ch3_6_SortStack {
	public static Stack<Integer> Ch3_6_SortStack(Stack<Integer> s){
		Stack<Integer> result = new Stack<Integer>();
		while(!s.isEmpty()){
			int temp = s.pop();
			while(!result.isEmpty() && result.peek()>temp){
				s.push(result.pop());
			}
			result.push(temp);
		}
		return result;
	}
	
	public static void main(String[] args){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(2);
		stack.push(5);
		stack.push(7);
		stack.push(1);
		stack = Ch3_6_SortStack(stack);
		System.out.print(stack.pop());
		System.out.print(stack.pop());
		System.out.print(stack.pop());
		System.out.print(stack.pop());
		System.out.print(stack.pop());
	}
}

package Ch3.StacksAndQueues;

import java.util.Stack;

public class Ch3_2_Stackmin extends Stack<Integer>{//extends java.util.Stack
	Stack<Integer> s; //store the min values
	public Ch3_2_Stackmin(){
		s = new Stack<Integer>();
	}
	
	public int min(){
		if(s.isEmpty()){
			return Integer.MAX_VALUE;
		}
		else{
			return s.peek();//take out the real min from the extra stack s
		}
	}
	
	public void push(int value){
		if(value <= min()){
			s.push(value); //push the new min value if necessary
		}
		super.push(value);
	}
	
	public Integer pop(){
		int value = super.pop();
		if(value==min()){
			s.pop();//get rid of the previous min value from s as well
		}
		return value;
	}
	
	public static void main(String[] args){
		Ch3_2_Stackmin myMinStack = new Ch3_2_Stackmin();
		myMinStack.push(5);
		System.out.print(myMinStack.min());
		System.out.print('\n');
		myMinStack.push(6);
		System.out.print(myMinStack.min());
		System.out.print('\n');
		myMinStack.push(3);
		System.out.print(myMinStack.min());
		System.out.print('\n');
		myMinStack.push(7);
		System.out.print(myMinStack.min());
		System.out.print('\n');
		myMinStack.pop();
		System.out.print(myMinStack.min());
		System.out.print('\n');
		myMinStack.pop();
		System.out.print(myMinStack.min());
		System.out.print('\n');
	}
}



//public class Ch3_2_Stackmin { //没考虑Pop()之后的min处理
//	Node top;
//	Object min;
//	
//	Object pop(){
//		if(top!=null){
//			Object item = top.data;
//			top = top.next;
//			return item;
//		}
//		return null;
//	}
//	
//	void push(Object item){
//		if(min == null){
//			min = item;
//		}
//		else{
//			if((int)item<(int)min){
//				min = item;
//			}
//		}	
//		
//		Node t = new Node(item);
//		t.next = top;
//		top = t;
//	}
//	
//	Object peek(){
//		return top.data;
//	}
//	
//	Object min(){
//		return min;
//	}
//}

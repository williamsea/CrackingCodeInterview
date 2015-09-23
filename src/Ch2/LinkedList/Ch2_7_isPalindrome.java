package Ch2.LinkedList;

import java.util.Stack;

public class Ch2_7_isPalindrome {

	public static void main(String args[]){
		Node palidrome = new Node(0);
		palidrome.next = new Node(1);
		palidrome.next.next = new Node(2);
		palidrome.next.next.next = new Node(1);
		palidrome.next.next.next.next = new Node(0);
		
		boolean isPalindrome = isPalindrome(palidrome);
		System.out.print(isPalindrome);
	}
	
	public static boolean isPalindrome(Node head){
		Node slow = head;
		Node fast = head;
		
		Stack<Integer> stack = new Stack<Integer>();
		while(fast!=null && fast.next!=null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(fast!=null){//in case list has odd elements. Note: both pointers start with head
			slow = slow.next; //skip the center point
		}
		
		while(slow!=null){
			if(slow.data != stack.pop()){
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
}

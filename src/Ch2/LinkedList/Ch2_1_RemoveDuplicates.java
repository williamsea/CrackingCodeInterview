package Ch2.LinkedList;

import java.util.HashSet;

public class Ch2_1_RemoveDuplicates {

	public static void main(String args[]){
		Node head, curr;
		head = new Node(1);
		curr = head;
		int n=5;
		for(int i=0; i<n; i++){
			curr.next = new Node(i);
			curr = curr.next;
			curr.next = new Node(i);
			curr = curr.next;
		}
		
		curr = head;
		while(curr != null){
			System.out.print(curr.data);
			curr = curr.next;
		}
		System.out.print('\n');
		
//		removeDuplicate(head);
		removeDuplicateNoBuffer(head);
		curr = head;
		while(curr != null){
			System.out.print(curr.data);
			curr = curr.next;
		}
		
		
	}
	
	/**
	 * Using HashSet
	 * @param n
	 */
	public static void removeDuplicate(Node n){//put the head in
		HashSet<Integer> set = new HashSet<Integer>();
		Node prev = null;
		while(n != null){
			if(set.contains(n.data)){
				prev.next = n.next;
			}
			else{
				set.add(n.data);
				prev = n;
			}
			n=n.next;
		}
	}
	
	/**
	 * Two pointers
	 * No Buffer
	 * @param head
	 */
	public static void removeDuplicateNoBuffer(Node head){
		Node curr, runner;
		curr = head;
		while(curr!=null){
			runner = curr;
			while(runner.next!=null){
				if(runner.next.data == curr.data){
					runner.next = runner.next.next;
				}
				else{
					runner=runner.next;
				}
			}
			curr = curr.next;
		}
	}
	
	
}

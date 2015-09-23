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
		}
		
		curr = head;
		while(curr != null){
			System.out.print(curr.data);
			curr = curr.next;
		}
		System.out.print('\n');
		
		removeDuplicate(head);
		curr = head;
		while(curr != null){
			System.out.print(curr.data);
			curr = curr.next;
		}
	}
	
	public static void removeDuplicate(Node n){
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
}

package Ch2.LinkedList;

public class Ch2_2_FindKthToLast {
	public static void main(String args[]){
		Node head, curr, target;
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
		
		int k=6;
		target = FindKthToLast(head, k);
		System.out.print(target.data);
		
	}
	
	public static Node FindKthToLast(Node head, int k){
		if(k<0) return null;//Error check
		
		Node fast, slow;
		fast = head;
		slow = head;
		for(int i=0; i<k; i++){
			if(fast == null) return null;//Error check
			fast = fast.next;
		}
		while(fast!=null){//Finally fast at null, slow at kth to end
			fast = fast.next;
			slow = slow.next;
		}
		
		return slow;
	}
}

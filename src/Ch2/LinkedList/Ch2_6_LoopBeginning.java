package Ch2.LinkedList;

public class Ch2_6_LoopBeginning {
	public static void main(String args[]){
		Node loop = new Node(1);
		loop.next = new Node(2);
		loop.next.next = new Node(3);
		loop.next.next.next = new Node(4);
		loop.next.next.next.next = new Node(5);
		loop.next.next.next.next.next = loop.next.next;
		// 1-2-3-4-5->(3-4-5)
		
		Node result = loopBeginning(loop);
		System.out.print(result.data);
	}
	
	public static Node loopBeginning(Node head){
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast){
				slow = head;
				while(true){
					if(slow==fast){ 
						return fast;
					}
					slow = slow.next;
					fast = fast.next;
				}
			}
		}
		return null;
		
	}
}

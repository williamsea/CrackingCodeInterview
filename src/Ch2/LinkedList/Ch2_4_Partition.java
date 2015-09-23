package Ch2.LinkedList;

public class Ch2_4_Partition {
	public static void main(String args[]){
		Node head, curr, target;
		head = new Node(1);
		curr = head;
		int n=10;
		for(int i=n; i>=0; i--){
			curr.next = new Node(i);
			curr = curr.next;
		}
		
		curr = head;
		while(curr != null){
			System.out.print(curr.data);
			System.out.print('\t');
			curr = curr.next;
		}
		System.out.print('\n');
		
		int x=5;
		head = partition(head, x);
		curr = head;
		while(curr != null){
			System.out.print(curr.data);
			System.out.print('\t');
			curr = curr.next;
		}
	}
	
	public static Node partition(Node node, int x){//pass head here
		Node smallStart = null;
		Node largeStart = null;
		Node smallRunner = null;
		Node largeRunner = null;

		while(node!=null){
			Node next = node.next;//take the next
			node.next = null;//Cutoff the link
			if(node.data<x){
				if(smallStart == null){
					smallStart = node;
					smallRunner = smallStart; //初始化
				}
				else{
					smallRunner.next = node;//链接前一个node和当前一个node
					smallRunner = node;//更新runner值
				}
			}
			else{
				if(largeStart==null){
					largeStart = node;
					largeRunner = largeStart;
				}
				else{
					largeRunner.next=node;
					largeRunner = node;
				}
			}
			node = next;//update node
		}
		if(smallStart==null){
			return largeStart;
		}
		
		smallRunner.next = largeStart;//connect small ending node and large starting node
		return smallStart;
	}
}

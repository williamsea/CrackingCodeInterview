package Ch2.LinkedList;

public class Ch2_5_AddLists {
	public static void main(String args[]){
		Node list1 = new Node(7);
		list1.next = new Node(1);
		list1.next.next = new Node(6);
		list1.next.next.next = new Node(1);
		list1.next.next.next.next = new Node(1);
		Node list2 = new Node(5);
		list2.next = new Node(9);
		list2.next.next = new Node(3);
		
		
//		Node result = addLists(list1, list2);
		Node result = addLists2(list1, list2);

		while(result!=null){
			System.out.print(result.data);
			System.out.print('\t');
			result = result.next;
		}
	}
	
	/**
	 * 719+59311 = 21021, 1's comes first in list
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static Node addLists(Node list1, Node list2){
		if(list1==null && list2==null) return null;

		int val;
		int carry=0;
		Node result = new Node(0);
		Node fakeHead = result;
		
		while(list1!=null && list2!=null){
			val = list1.data + list2.data + carry;

			if(val>=10){
				val -= 10;
				carry = 1;
			}
			else{
				carry = 0;
			}
			result.next = new Node(val);
			result = result.next;
			list1 = list1.next;
			list2 = list2.next;
		}
		
		while(list1!=null){
			val = list1.data+carry;
			if(val>=10){
				val -= 10;
				carry=1;
			}
			else{
				carry=0;
			}
			result.next = new Node(val);
			result = result.next;
			list1 = list1.next;
		}
		
		//same for list2
		
		return fakeHead.next;
	}
	
	/**
	 * The 1's comes last
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static Node addLists2(Node list1, Node list2){
	//It is easier to reverse two lists and then reverse the result!
		list1 = reverse(list1);
		list2 = reverse(list2);
		Node result = addLists(list1, list2);
		result = reverse(result);
		return result;
	}
	
	public static Node reverse(Node list){
		Node pre, cur, next;
		pre = null;
		cur = list; //head
		while(cur.next!=null){
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		cur.next = pre;//For the last arrow
		return cur;
	}
	
}

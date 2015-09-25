package Ch3.StacksAndQueues;

import java.util.Stack;

public class Ch3_4_HanoiTower {
	private Stack<Integer> disks;
	private int index;
	
	public Ch3_4_HanoiTower(int i){
		disks = new Stack<Integer>();
		index = i;
	}
	
	public int index(){
		return index;
	}
	
	public void add (int d){
		if(!disks.isEmpty() && disks.peek() <=d){
			System.out.print("Error Placing Disk " + d);
		}
		else{
			disks.push(d);
		}
	}
	
	public void moveTopTo(Ch3_4_HanoiTower t){
		int top = disks.pop();
		t.add(top);
		System.out.print("Move Disk " + top + " from " + index() + " to " +  t.index + '\n');
	}
	
	public void moveDisks(int n, Ch3_4_HanoiTower destination, Ch3_4_HanoiTower buffer){
		if(n>0){
			moveDisks(n-1, buffer, destination);//from origin(this), dest as buffer
			moveTopTo(destination);
			buffer.moveDisks(n-1, destination, this);//from buffer, ori(this) as buffer
		}
	}
	
	public static void main(String[] args){
		int n=3;
		Ch3_4_HanoiTower[] towers = new Ch3_4_HanoiTower[n];
		for(int i=0; i<n; i++){
			towers[i] = new Ch3_4_HanoiTower(i);//give three towers corresponding indexes
		}
		
		for(int i=n-1;i>=0; i--){
			towers[0].add(i);//put disks on tower[0]
		}
		
		towers[0].moveDisks(n, towers[2], towers[1]);
	}
	
}

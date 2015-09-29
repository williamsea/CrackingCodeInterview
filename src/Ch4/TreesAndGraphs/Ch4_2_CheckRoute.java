package Ch4.TreesAndGraphs;

import java.util.LinkedList;

public class Ch4_2_CheckRoute {
	public enum State{
		Unvisited, Visited, Visiting;
	}
	
	public static boolean BFSsearch(Graph g, TreeNode start, TreeNode end){
		if(start == end){
			return true;
		}
		
		//Queue
		LinkedList<TreeNode> q = new LinkedList<TreeNode>();
		
		for(TreeNode u: g.getNodes()){
			u.state = State.Unvisited;//set all nodes to unvisited initially
		}
		
		start.state = State.Visiting;
		q.add(start);
		TreeNode u;
		while(!q.isEmpty()){
			u=q.removeFirst(); //dequeue
			if(u!=null){
				for(TreeNode v: u.getAdjacent()){
					if(v.state == State.Unvisited){//only consider unvisited nodes
						if(v == end){
							return true;
						}
						else{
							v.state = State.Visiting;
							q.add(v);//enqueue
						}
					}
				}
				u.state = State.Visited;//all its adjacent nodes are checked
			}
		}
		return false;
	}
}

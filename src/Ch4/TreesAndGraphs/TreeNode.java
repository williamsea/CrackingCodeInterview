package Ch4.TreesAndGraphs;

import java.util.LinkedList;

import Ch4.TreesAndGraphs.Ch4_2_CheckRoute.State;

public class TreeNode {
	public TreeNode left = null;
	public TreeNode right = null;
	Object data;
	State state;
	
	public TreeNode(Object val){
		data = val;
	}
	
	void appendToLeft(Object val){
		TreeNode leftChild = new TreeNode(val);
		TreeNode node = this;
		node.left = leftChild;
	}
	
	void appendToRight(Object val){
		TreeNode rightChild = new TreeNode(val);
		TreeNode node = this;
		node.right = rightChild;
	}
	
	LinkedList<TreeNode> getAdjacent(){
		LinkedList<TreeNode> adjacents = new LinkedList<TreeNode>();
		return adjacents;
	}
	
}

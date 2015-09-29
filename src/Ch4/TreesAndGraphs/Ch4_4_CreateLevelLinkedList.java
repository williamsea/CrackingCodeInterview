package Ch4.TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ch4_4_CreateLevelLinkedList {
	public ArrayList<LinkedList<TreeNode>> craeteLevelLinkedList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		if(root!=null){
			current.add(root);
		}
		
		while(current.size()!=0){
			result.add(current);//add previous list to result
			LinkedList<TreeNode> parents = current; //store the previous level
			current = new LinkedList<TreeNode>();//next level
			for(TreeNode n: parents){//visit and add children to current
				if(n.left!=null){
					current.add(n.left);
				}
				if(n.right!=null){
					current.add(n.right);
				}
			}
		}
		return result;
	}
}

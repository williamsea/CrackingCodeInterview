package Ch4.TreesAndGraphs;

public class TreeNode {
	TreeNode left = null;
	TreeNode right = null;
	Object data;
	
	TreeNode(Object val){
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
	
}

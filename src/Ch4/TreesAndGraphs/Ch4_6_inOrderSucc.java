package Ch4.TreesAndGraphs;

public class Ch4_6_inOrderSucc {
	public TreeNode inOrderSucc(TreeNode n){
		if(n==null){
			return null;
		}
		if(n.right!=null){
			return leftMostChild(n.right);
		}
		else{
			TreeNode prev = n;
			TreeNode parent = prev.parent;
			while(parent != null && parent.left != prev){
				prev = parent;
				parent = parent.parent;
			}
			return parent;
		}
	}
	
	public TreeNode leftMostChild(TreeNode n){
		if(n==null){
			return null;
		}
		while(n.left!=null){
			n=n.left;
		}
		return n;
	}
}

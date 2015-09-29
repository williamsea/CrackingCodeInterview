package Ch4.TreesAndGraphs;

public class Ch4_8_MatchTree {
	boolean containsTree(TreeNode t1, TreeNode t2){
		if(t2==null){
			return true;
		}
		return subTree(t1, t2);
	}
	
	boolean subTree(TreeNode r1, TreeNode r2){
		if(r1 == null){
			return false;
		}
		if(r1.data == r2.data){
			return matchTree(r1, r2);
		}
		return (subTree(r1.left,r2) || subTree(r1.right, r2));
	}
	
	boolean matchTree(TreeNode r1, TreeNode r2){
		if(r1 == null && r2 == null){
			return true;
		}
		
		if(r1 == null || r2 == null){
			return false;
		}
		
		if(r1.data != r2.data){
			return false;
		}
		
		return (matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right));
	}
}

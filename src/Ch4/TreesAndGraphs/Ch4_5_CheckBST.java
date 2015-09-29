package Ch4.TreesAndGraphs;

public class Ch4_5_CheckBST {
	public boolean chenckBST(TreeNode root){
		return checkBST(root, null, null);
	}
	
	public boolean checkBST(TreeNode n, Integer min, Integer max){
		if(n == null){
			return true;
		}
		if( (min!=null && (int) n.data <= min) || (max!=null && (int) n.data>max) ){//check current n
			return false;
		}
		if( (!checkBST(n.left, min, (int) n.data)) || (!checkBST(n.right, (int) n.data, max)) ){ //有false就返回false
			return false;
		}  
		return true;
	}
}

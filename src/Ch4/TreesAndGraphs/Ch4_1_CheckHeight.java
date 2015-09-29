package Ch4.TreesAndGraphs;

public class Ch4_1_CheckHeight {
	public static int CheckHeight(TreeNode root){
		if(root == null){
			return 0;//height 0
		}
		
		int leftHeight = CheckHeight(root.left);//recursive
		if(leftHeight == -1){
			return -1;
		}
		
		int rightHeight = CheckHeight(root.right);//recursive
		if(rightHeight == -1){
			return -1;
		}
		
		int heightDiff = leftHeight - rightHeight;//calculated at each recursion
		if(Math.abs(heightDiff)>1){
			return -1;//once mismatch, return -1
		}
		else{
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}
	
	public static boolean isBalanced(TreeNode root){
		if(CheckHeight(root) == -1){
			return false;
		}
		else{
			return true;
		}
	}
}

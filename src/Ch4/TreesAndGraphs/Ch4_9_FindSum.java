package Ch4.TreesAndGraphs;

public class Ch4_9_FindSum {
	public void findSum(TreeNode node, int sum, int[] path, int level){
		if(node == null){
			return;
		}
		
		path[level] = (int) node.data;
		
		int temp=0;
		for(int i=level; i>=0; i--){
			temp+=path[i];
			if(temp == sum){
				printPath(path, i, level);
			}
		}
		
		findSum(node.left, sum, path, level+1);
		findSum(node.right, sum, path, level+1);
		
		path[level] = Integer.MIN_VALUE;
		
	}
	
	public void findSum(TreeNode root, int sum){
		int depth = depth(root);
		int[] path = new int[depth];
		findSum(root, sum, path, 0);
	}
	
	
	public int depth(TreeNode node){
		if(node == null){
			return 0;
		}
		else{
			return 1+Math.max(depth(node.left), depth(node.right));
		}
		
	}
	
	public void printPath(int[] path, int start, int end){
		
		for(int i=start; i<=end; i++){
			System.out.print(path[i]+" ");
		}
		System.out.println();
	}
}

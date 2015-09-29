package Ch4.TreesAndGraphs;


public class CH4_3_CreateMinBST {
	public TreeNode createMinBST(int[] arr, int start, int end){
		if(start>end){
			return null;
		}
		
		int mid = (start+end)/2;
		TreeNode n = new TreeNode(arr[mid]);
		n.left = createMinBST(arr, start, mid-1);
		n.right = createMinBST(arr, mid+1, end);
		
		return n;
	}
	
	public TreeNode createMinBST(int[] array){
		return createMinBST(array, 0, array.length-1);
	}
}

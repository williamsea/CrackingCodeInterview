package Ch4.TreesAndGraphs;

public class Ch4_7_CommonAncestor {
	public Result lowestCommonAncestorHelper(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return new Result(null, false);
        }
        if(root == p && root == q){
            return new Result(root, true);
        }
        
        Result rx = lowestCommonAncestorHelper(root.left, p, q);
        if(rx.isAncestor){
            return rx;
        }
        
        Result ry = lowestCommonAncestorHelper(root.right, p, q);
        if(ry.isAncestor){
            return ry;
        }
        
        if(rx.node != null && ry.node != null){
            return new Result(root, true);
        }
        else if(root==p || root ==q){
            boolean isAncestor = rx.node != null || ry.node != null ? true : false;
            return new Result(root, isAncestor);
        }
        else{
            return new Result(rx.node != null ? rx.node : ry.node, false);
        }
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Result r = lowestCommonAncestorHelper(root, p, q);
        if(r.isAncestor){
            return r.node;
        }
        return null;
    }
}

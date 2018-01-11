package LeetCode;

public class Maximum_Depth {
	
	public int maxDepth(TreeNode root) {
		if(root == null) return 0;
		int depth_left = maxDepth(root.left) + 1;
	    int depth_right = maxDepth(root.right) + 1;
	    
		return Math.max(depth_left, depth_right);
	}
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int leftHeight = getHeight(root.left);
        int rigthHeigth = getHeight(root.right);
        if(Math.abs(leftHeight - rigthHeigth) > 1)
        return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private static int getHeight(TreeNode node){
        if(node == null) return 1;
        return Math.max(getHeight(node.left),getHeight(node.right))+1;
    }
}

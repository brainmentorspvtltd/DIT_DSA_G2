class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x){
        this.val = x;
    }
}
public class IsMinHeap {

    static boolean isMinheap(TreeNode root){
        return helper(root, Integer.MIN_VALUE);
    }

    static boolean helper(TreeNode node , int parentValue){
        if(node == null){
            return true;
        }
        if(node.val < parentValue){
            return false;
        }
        return helper(node.left, node.val) && helper(node.right, node.val);
    } 
    public static void main(String[] args) {
        TreeNode root =new TreeNode(50);
        root.left = new TreeNode(40);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(5);

        System.out.println(isMinheap(root));

        TreeNode root1 =new TreeNode(5);
        root1.left = new TreeNode(10);
        root1.right = new TreeNode(17);
        root1.left.left = new TreeNode(35);
        root1.left.right = new TreeNode(50);

        System.out.println(isMinheap(root1));
    }
}

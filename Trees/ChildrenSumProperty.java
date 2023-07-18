package Trees;

public class ChildrenSumProperty {

    boolean isSum(BinaryTree<Integer> root) {
        if(root == null) {
            return true;
        }
        // if we have traversed the whole tree completely, it means it follows
        // children sum property
        if(root.left == null && root.right == null) {
            return true;
        }
        int sum = 0;
        if(root.left != null) {
            // doing the sum of child elements
            sum += root.left.data;
        }
        if(root.right != null) {
            sum += root.right.data;    
        }
        return (sum == root.data && isSum(root.left) && isSum(root.right));
    }

    public static void main(String[] args) {
        
    }
}

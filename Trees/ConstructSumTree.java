package Trees;

public class ConstructSumTree {

    public int sumTree(BinaryTree<Integer> root) {
        if(root == null) {
            return 0;
        }
        // traverse to the left most child of tree
        int left = sumTree(root.left);
        int right = sumTree(root.right);
        int currentVal = root.data;
        root.data = left + right;
        return left + right + currentVal;
    }

    public static void main(String[] args) {
        
    }
}

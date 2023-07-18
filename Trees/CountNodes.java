package Trees;

public class CountNodes {

    int countNode(BinaryTree<Integer> root) {
        if(root == null) {
            return 0;
        }
        int counter = 1;
        counter += countNode(root.left);
        counter += countNode(root.right);
        return counter;
    }

    public static void main(String[] args) {
        
    }
}

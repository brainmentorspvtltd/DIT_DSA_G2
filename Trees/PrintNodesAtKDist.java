package Trees;

public class PrintNodesAtKDist {
    void printKNodes(BinaryTree<Integer> root, int k) {
        if(root == null) {
            return;
        }
        if(k == 0) {
            System.out.print(root.data + ",");
        }
        else {
            printKNodes(root.left, k - 1);
            printKNodes(root.right, k - 1);
        }
    }
    public static void main(String[] args) {
        
    }
}

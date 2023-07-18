package Trees;

public class Ancestors {

    boolean printAncestors(BinaryTree<Integer> node, int target) {
        if(node == null) {
            return false;
        }
        if(node.data == target) {
            return true;
        }
        if(printAncestors(node.left, target) || printAncestors(node.right, target)) {
            System.out.println(node.data);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}

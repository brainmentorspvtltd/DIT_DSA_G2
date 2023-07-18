package Trees;

import java.util.Stack;

public class SpiralOrder {

    void printSpiral(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        // Create two stacks to store alternate levels
        // print levels from right to left
        Stack<BinaryTree<Integer>> oddStack = new Stack<>();
        // print levels from left to right
        Stack<BinaryTree<Integer>> evenStack = new Stack<>();

        // push the first level to odd stack
        oddStack.push(root);

        while(!oddStack.isEmpty() || !evenStack.isEmpty()) {
            while(!oddStack.isEmpty()) {
                // peek return top most element of stack
                BinaryTree<Integer> temp = oddStack.peek();
                oddStack.pop();
                System.out.println(temp.data);
                if(temp.right != null) {
                    evenStack.push(temp.right);
                }
                if(temp.left != null) {
                    evenStack.push(temp.left);
                }
            }

            while(!evenStack.isEmpty()) {
                // peek return top most element of stack
                BinaryTree<Integer> temp = oddStack.peek();
                oddStack.pop();
                System.out.println(temp.data);

                if(temp.left != null) {
                    oddStack.push(temp.left);
                }
                if(temp.right != null) {
                    oddStack.push(temp.right);
                }
            }
        }

        
    }

    public static void main(String[] args) {
        
    }
}

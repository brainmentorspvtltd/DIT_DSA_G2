package Trees;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;

class BinaryTree<T> {
    T data;
    BinaryTree<T> left;
    BinaryTree<T> right;
    BinaryTree(T data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeOps {
    String msg = "root";
    BinaryTree<Integer> insert() {
        System.out.println("Enter the " + msg + " data");
        int data = new Scanner(System.in).nextInt();
        if(data == -1) {
            return null;
        }
        BinaryTree<Integer> node = new BinaryTree<Integer>(data);
        msg = "left";
        node.left = insert();
        msg = "right";
        node.right = insert();
        msg = "root";
        return node;
    }

    void print(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        String output = "";
        output += root.data + " => ";
        if(root.left != null) {
            output += "L : " + root.left.data;
        }
        if(root.right != null) {
            output += " R : " + root.right.data;
        }
        System.out.println(output);
        print(root.left);
        print(root.right);   
    }

    void preOrder(BinaryTree<Integer> root) {
        // Root, Left, Right
        if(root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(BinaryTree<Integer> root) {
        // Left, Root, Right
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    void postOrder(BinaryTree<Integer> root) {
        // Left, Right, Root
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    void levelOrder(BinaryTree<Integer> root) {
        LinkedList<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryTree<Integer> node = queue.removeFirst();
            System.out.println(node.data);
            if(node.left != null) {
                queue.addLast(node.left);
            }
            if(node.right != null) {
                queue.addLast(node.right);
            }
        }
    }

    void preOrderIterative(BinaryTree<Integer> root) {
        // P,L,R
        if(root == null) {
            return;
        }
        Stack<BinaryTree<Integer>> st = new Stack<>();
        BinaryTree<Integer> current = root;
        while(!st.isEmpty() || current != null) {
            if(!st.isEmpty() && current == null) {
                current = st.pop();
            }
            System.out.println(current.data);
            if(current.right != null) {
                st.push(current.right);
            }
            current = current.left;
        }
    }

    void inOrderIterative() {

    }

    void postOrderIterative() {
        
    }

    public static void main(String[] args) {
        BinaryTreeOps obj = new BinaryTreeOps();
        BinaryTree<Integer> root = obj.insert();
        obj.print(root);
    }
}

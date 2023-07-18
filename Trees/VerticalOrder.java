package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class VerticalPair {
    BinaryTree<Integer> node = null;
    int h1 = 0;
    VerticalPair(BinaryTree<Integer> node, int h1) {
        this.node = node;
        this.h1 = h1;
    }
}

public class VerticalOrder {

    static void verticalTraversal(BinaryTree<Integer> root) {
        LinkedList<VerticalPair> queue = new LinkedList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        queue.addLast(new VerticalPair(root, 0));
        int minh1 = 0, maxh1 = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                VerticalPair vp = queue.removeFirst();

                maxh1 = Math.max(maxh1, vp.h1);
                minh1 = Math.min(minh1, vp.h1);

                map.putIfAbsent(vp.h1, new ArrayList<>());
                map.get(vp.h1).add(vp.node.data);

                if(vp.node.left != null) {
                    queue.addLast(new VerticalPair(vp.node.left, vp.h1 - 1));
                }
                if(vp.node.right != null) {
                    queue.addLast(new VerticalPair(vp.node.right, vp.h1 + 1));
                }
            }
        }
        for(int i = minh1; i <= maxh1; i++) {
            ans.add(map.get(i));
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        BinaryTree<Integer> root = new BinaryTree<>(10);
        root.left = new BinaryTree<>(20);
        root.right = new BinaryTree<>(30);
        root.left.left = new BinaryTree<>(40);
        root.left.right = new BinaryTree<>(50);
        root.right.right = new BinaryTree<>(60);
        root.right.right.left = new BinaryTree<>(70);
        verticalTraversal(root);
    }
}

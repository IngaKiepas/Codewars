/* 
You are given a binary tree:
class Node:
    def __init__(self, L, R, n):
        self.left = L
        self.right = R
        self.value = n

Your task is to return the list with elements from tree sorted by levels, which means the root element goes first, then root
children (from left to right) are second and third, and so on. Return empty list if root is None.
*/

import java.util.*;

class Node {
    Node left;
    Node right;
    int value;

    Node(Node L, Node R, int n) {
        left = L;
        right = R;
        value = n;
    }
}

public class Kata {
    public static List<Integer> treeByLevels(Node node)
    {
        List<Integer> result = new ArrayList<>();
        if (node == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                result.add(current.value);
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Node tree = 
        new Node(
            new Node(
                new Node(null, null, 4),
                new Node(null, null, 5),
                2
            ),
            new Node(null, null, 3),
            1
         );

         System.out.println(treeByLevels(tree));
    }
}
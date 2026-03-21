package binaryTree;

public class minimumInBT {
    public static void main(String[] args) {
        Node n1 = new Node(15);
        Node n2 = new Node(9);
        Node n3 = new Node(20);
        Node n4 = new Node(15);
        Node n5 = new Node(7);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        System.out.println(minimum(root));
    }
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    static int minimum(Node root){
        if (root == null) return Integer.MAX_VALUE;
        int minFromLeft = minimum(root.left);
        int minFromRight = minimum(root.right);
        return Math.min(Math.min(minFromLeft,minFromRight), root.data);
    }

}

package binaryTree;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class traversal {
    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(9);
        Node n3 = new Node(20);
        Node n4 = new Node(15);
        Node n5 = new Node(7);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);

        System.out.println();

        System.out.println(inorderTraversal(root));

    }

    static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);

    }

    static List<Integer> inorderTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalHelper(root,result);
        return result;

    }

    static void inorderTraversalHelper(Node root,List<Integer> result) {
        if (root != null){
            inorderTraversalHelper(root.left, result);
            result.add(root.data);
            inorderTraversalHelper(root.right,result);

        }

    }

    static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");

    }


    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

}

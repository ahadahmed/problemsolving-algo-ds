package com.maico.datastructure.tree;

import java.util.Scanner;

public class LowestCommonAncestor {
    static Node root;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n-- > 0) {
            int i = scanner.nextInt();
            root = BinaryTree.insertNode(root,i);

        }
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        inOrder(root);
        Node lca = lcaOfBinarySearchTree(root, n1, n2);
        System.out.println();
        System.out.println(lca.getNodeValue());

    }


    public static Node lcaOfBinarySearchTree(Node node, int n1, int n2) {
        if(node == null){
            return null;
        }

        if (node.getNodeValue() > n1 && node.getNodeValue() > n2) {
            return lcaOfBinarySearchTree(node.getLeftNode(), n1, n2);
        }

        if (node.getNodeValue() < n1 && node.getNodeValue() < n2) {
            return lcaOfBinarySearchTree(node.getRightNode(), n1, n2);
        }


        return node;
    }

    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.getLeftNode());
            System.out.print(root.getNodeValue() + " ");
            inOrder(root.getRightNode());
        }
    }
}

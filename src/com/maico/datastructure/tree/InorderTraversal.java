package com.maico.datastructure.tree;

import java.util.Scanner;

public class InorderTraversal {

    private static Node root;






    public static Node insert(Node root, int key){

        if(root == null){
            return new Node(key);
        }else {
            Node cur;
            if(key <= root.getNodeValue()){
                cur = insert(root.getLeftNode(), key);
                root.setLeftNode(cur);
            }else {
                cur = insert(root.getRightNode(),key);
                root.setRightNode(cur);
            }
        }
        return root;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){

            int data = scanner.nextInt();
            root = insert(root, data);
        }
//        inorder(root);
        int h = height(root);
        System.out.println(h);
    }

    public static void inorder(Node root){
        if(root != null){
            inorder(root.getLeftNode());
            System.out.print(root.getNodeValue()+" ");
            inorder(root.getRightNode());
        }
    }

    public static int height(Node root){
        int leftH = 0;
        int rightH = 0;
        if(root.getLeftNode() == null && root.getRightNode() == null){
            return 0;
        }else {
            if(root.getLeftNode() != null){
                leftH = height(root.getLeftNode())+1;
            }else {
                rightH = height(root.getRightNode())+1;
            }
        }

        return Math.max(leftH, rightH);

    }




}

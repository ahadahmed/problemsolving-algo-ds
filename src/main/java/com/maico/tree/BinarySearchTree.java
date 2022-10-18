package com.maico.tree;

public class BinarySearchTree {

    private TreeNode root;

    public BinarySearchTree(TreeNode root){
        this.root = root;
    }

    public BinarySearchTree(int rootValue){
        this.root = new TreeNode(rootValue);
    }

    public TreeNode insertNode(int value){
        TreeNode currentNode = this.root;
        while (currentNode != null) {
            if (value < currentNode.nodeValue) {
                if (currentNode.leftChild == null) {
                    currentNode.leftChild = new TreeNode(value);
                    break;
                } else {
                    currentNode = currentNode.leftChild;
                }
            }else if (value > currentNode.nodeValue) {
                if (currentNode.rightChild == null) {
                    currentNode.rightChild = new TreeNode(value);
                    break;
                } else {
                    currentNode = currentNode.rightChild;
                }
            }
        }
        return this.root;
    }


    public TreeNode getRoot(){
        return root;
    }


    public static class TreeNode{
        public int nodeValue;
        public TreeNode leftChild;
        public TreeNode rightChild;

        public TreeNode(int value){
            this.nodeValue = value;
            this.leftChild = null;
            this.rightChild = null;
        }

        public TreeNode(int nodeValue, TreeNode leftChild, TreeNode rightChild){
            this(nodeValue);
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

    }
}

package com.maico.tree;

import java.util.Stack;

/**
 * @author ahadahmed - 8/9/20
 * @see <a href="#"> see this</a>
 */
public class TreeTraversal {

    public static void main(String[] args) {
        TreeNode root = createTree();
//        inOrderTraversalRecursive(root);
        inOrderTraversalIterative(root);
    }

    static public void inOrderTraversalRecursive(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversalRecursive(node.leftChild);
        System.out.println(node.value);
        inOrderTraversalRecursive(node.rightChild);

    }

    static public void inOrderTraversalIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        TreeNode currentNode = root;
        while (currentNode != null || stack.size() > 0) {

            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.rightChild;
            }
                currentNode = stack.firstElement().leftChild;


                while (currentNode != null) {
                    stack.push(currentNode);
                    currentNode = currentNode.leftChild;
                }

                System.out.println(stack.pop().value);


            }
        }







    static public TreeNode createTree() {
        TreeNode rootNode = new TreeNode(1);
        TreeNode leftChild;
        TreeNode rightChild;
        leftChild = rootNode.leftChild(null);
        rightChild = rootNode.rightChild(new TreeNode(2));
        leftChild = rightChild.leftChild(new TreeNode(3));
        rightChild = rightChild.rightChild(null);
        return rootNode;
    }


    static class TreeNode {
        public int value;
        public TreeNode leftChild;
        public TreeNode rightChild;

        public TreeNode(int value) {
            this.value = value;
        }

        public TreeNode leftChild(TreeNode o) {
            this.leftChild = o;
            return this.leftChild;
        }

        public TreeNode rightChild(TreeNode treeNode) {
            this.rightChild = treeNode;
            return this.rightChild;
        }
    }


}

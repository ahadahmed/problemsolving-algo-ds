package com.maico.datastructure.tree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/** This is also called level order traversal */
public class BreadthFirstTraversal {

    private static Node root;

    private static Node insertNode(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node current;
            if (data <= root.getNodeValue()) {
                current = insertNode(root.getLeftNode(), data);
                root.setLeftNode(current);

            } else {
                current = insertNode(root.getRightNode(), data);
                root.setRightNode(current);
            }
        }

        return root;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nodeNumber = scanner.nextInt();
        while (nodeNumber-- > 0){
            int data = scanner.nextInt();
            root = insertNode(root,data);
        }

        breadthFirstTraversal(root);
    }


    private static void breadthFirstTraversal(Node root){

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while (! queue.isEmpty()){
            Node currentNodeInQueue = queue.poll();
            if (currentNodeInQueue.getLeftNode() != null) {
                queue.add(currentNodeInQueue.getLeftNode());

            }

            if (currentNodeInQueue.getRightNode() != null) {
                queue.add(currentNodeInQueue.getRightNode());
            }

            System.out.print(currentNodeInQueue.getNodeValue()+" ");

        }


    }
}

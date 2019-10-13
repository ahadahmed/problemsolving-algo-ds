package com.maico.datastructure.tree;

import java.util.*;

public class PrintBinaryTreeInVerticalOrder {

    private static Node root;
    private static TreeMap<Integer, List<Node>> horizontalDistanceMap = new TreeMap<>();

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int numberOfNodes = scanner.nextInt();

//        int[] nodes = {20,8,22,4,12,21,24,10,14,23,25};
        int[] nodes = {2, 1, 4, 3, 5, 6, 7};

        for(int i = 0; i < nodes.length; i++){
            root = BinaryTree.insertNode(root,nodes[i]);
        }

        /*while (numberOfNodes-- > 0){
            root = BinaryTree.insertNode(root,scanner.nextInt());
        }*/
//        verticalOrderTraversal(root, 0);
       /* verticalTraversalUsingBFS(root);
        for(Map.Entry<Integer, List<Node>> entry: horizontalDistanceMap.entrySet()){
            System.out.print(entry.getKey()+"--> ");
            for(Node n : entry.getValue()){
                System.out.print(n.getNodeValue()+" ");
            }
            System.out.println();
        }*/

        System.out.println(checkBinarySearchTree(root));
    }


    private static void verticalOrderTraversal(Node root, int horizontalDistance){



        if(horizontalDistanceMap.get(horizontalDistance) == null){
            List<Node> nodeList = new ArrayList<>();
            nodeList.add(root);
            horizontalDistanceMap.put(horizontalDistance,nodeList);
        }else {
            horizontalDistanceMap.get(horizontalDistance).add(root);
        }

        if(root.getLeftNode() != null){
            verticalOrderTraversal(root.getLeftNode(), horizontalDistance - 1);
        }

        if (root.getRightNode() != null) {
            verticalOrderTraversal(root.getRightNode(), horizontalDistance + 1);
        }


    }



    private static void verticalTraversalUsingBFS(Node root){
         class Pair{
             Node n;
             Integer hd;
            Pair(Node n, Integer i){
                this.n = n;
                this.hd =i;
            }
        }
        Queue<Pair> queue = new LinkedList<>();
        Integer horizontalDistance = 0;

        queue.add(new Pair(root, horizontalDistance));

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            horizontalDistance = pair.hd;
            if(horizontalDistanceMap.get(pair.hd) == null){
                List<Node> nodes = new ArrayList<>();
                nodes.add(pair.n);
                horizontalDistanceMap.put(pair.hd, nodes);
            }else {
                horizontalDistanceMap.get(pair.hd).add(pair.n);
            }

            if(pair.n.getLeftNode() != null){
                queue.add(new Pair(pair.n.getLeftNode(), horizontalDistance - 1));
            }

            if(pair.n.getRightNode() != null){
                queue.add(new Pair(pair.n.getRightNode(), horizontalDistance + 1));
            }

        }
    }


    private static boolean checkBinarySearchTree(Node root) {

        Queue<Node> nodeQueue = new LinkedList<>();


        Node leftChild = null;
        Node rightChild = null;

        if(root.leftNode != null){
            leftChild = root.leftNode;
            if(root.nodeValue <= leftChild.nodeValue){
                return false;
            }
        }

        if(root.rightNode != null){
            rightChild = root.rightNode;
            if(root.nodeValue >= rightChild.nodeValue){
                return false;
            }
        }

        nodeQueue.add(leftChild);
        while (!nodeQueue.isEmpty()) {
            Node temp = nodeQueue.poll();
            if (root.nodeValue < temp.nodeValue) {
                return false;
            } else {
                if (temp.leftNode != null) {

                    if (temp.nodeValue <= temp.leftNode.nodeValue) {
                        return false;
                    }
                    nodeQueue.add(temp.leftNode);
                }
                if (temp.rightNode != null) {
                    if(temp.nodeValue >= temp.rightNode.nodeValue || root.nodeValue <= temp.nodeValue){
                        return false;
                    }
                    nodeQueue.add(temp.rightNode);
                }
            }
        }

        nodeQueue.add(rightChild);

        while(!nodeQueue.isEmpty()){
            Node temp = nodeQueue.poll();
            if(root.nodeValue >= temp.nodeValue){
                return false;
            }else{
                if (temp.leftNode != null) {
                    if(temp.nodeValue <= temp.leftNode.nodeValue){
                        return false;
                    }
                    nodeQueue.add(temp.leftNode);
                }
                if (temp.rightNode != null) {
                    if(temp.nodeValue >= temp.rightNode.nodeValue){
                        return false;
                    }
                    nodeQueue.add(temp.rightNode);
                }
            }
        }

        return true;

    }
}

package com.maico.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	Node root;
	
	
	public BinaryTree() {
		root = null;
	}
	
	public BinaryTree(int key) {
		root = new Node(key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(8);
		binaryTree.root.setLeftNode(new Node(5));
		binaryTree.root.setRightNode(new Node(4));
		
		binaryTree.root.getLeftNode().setLeftNode(new Node(9));
		binaryTree.root.getLeftNode().setRightNode(new Node(7));
		
		binaryTree.root.getRightNode().setLeftNode(new Node(11));
		binaryTree.root.getRightNode().setRightNode(new Node(7));
		
		bfs(binaryTree.root);

	}
	
	
	public static void bfs(Node root) {
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node currentNode = queue.poll();
			System.out.print(currentNode.getNodeValue() + " ");
			if(currentNode.getLeftNode() != null) {
				queue.add(currentNode.getLeftNode());
			}
			
			if(currentNode.getRightNode() != null) {
				queue.add(currentNode.getRightNode());
			}
		}
	}

}

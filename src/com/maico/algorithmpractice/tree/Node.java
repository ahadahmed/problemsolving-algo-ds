package com.maico.algorithmpractice.tree;

public class Node {

	private int nodeValue;
	private Node leftNode;
	private Node rightNode;

	public Node(int nodeValue) {
		this.nodeValue = nodeValue;
		this.leftNode = this.rightNode = null;
	}

	public int getNodeValue() {
		return nodeValue;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

}

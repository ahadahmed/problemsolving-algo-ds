package com.maico.datastructure.tree;

public class Node {

	public int nodeValue;
	public Node leftNode;
	public Node rightNode;

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

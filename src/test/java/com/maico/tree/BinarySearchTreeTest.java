package com.maico.tree;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    private BinarySearchTree binarySearchTree;

    @BeforeEach
    void init(){
        binarySearchTree = new BinarySearchTree(5);
    }

    @Test
    @DisplayName("Insert larger value than root, should create a right child")
    void insertRight() {
       BinarySearchTree.TreeNode root = binarySearchTree.insertNode(7);
        assertNull(root.leftChild);
        assertNotNull(root.rightChild);
        assertEquals(7, root.rightChild.nodeValue );


    }

    @Test
    @DisplayName("Insert smaller value than root, should create a left child")
    void insertLeftNode() {
        BinarySearchTree.TreeNode root = binarySearchTree.insertNode(3);
        assertNotNull(root.leftChild);
        assertNull(root.rightChild);
        assertEquals(3, root.leftChild.nodeValue );


    }

    @Test
    @DisplayName("Should create a left node and a right node")
    void insertLeftAndRightNode() {
        BinarySearchTree.TreeNode root = binarySearchTree.insertNode(3);
        binarySearchTree.insertNode(7);
        assertNotNull(root.leftChild);
        assertNotNull(root.rightChild);
        assertEquals(3, root.leftChild.nodeValue );
        assertEquals(7, root.rightChild.nodeValue );


    }

    @Test
    @DisplayName("Should create a left node and a right node")
    void insertLeftAndRightNode2() {
        BinarySearchTree.TreeNode root = binarySearchTree.insertNode(3);
        binarySearchTree.insertNode(7);
        binarySearchTree.insertNode(2);
        binarySearchTree.insertNode(4);
        binarySearchTree.insertNode(10);
        binarySearchTree.insertNode(8);
        binarySearchTree.insertNode(9);

        assertNotNull(root.leftChild);
        assertNotNull(root.rightChild);
        assertNotNull(root.leftChild.leftChild);
        assertNotNull(root.leftChild.rightChild);
        assertEquals(3, root.leftChild.nodeValue );
        assertEquals(2, root.leftChild.leftChild.nodeValue );
        assertEquals(7, root.rightChild.nodeValue );


    }

    @Test
    void getRoot() {
        assertEquals(5, this.binarySearchTree.getRoot().nodeValue);
    }
}
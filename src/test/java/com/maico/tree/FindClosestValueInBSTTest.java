package com.maico.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindClosestValueInBSTTest {
    private FindClosestValueInBST root;

    @BeforeEach
    void setUp() {
        root = new FindClosestValueInBST(10);
        root.left = new FindClosestValueInBST(5);
        root.left.left = new FindClosestValueInBST(2);
        root.left.right = new FindClosestValueInBST(5);
        root.left.left.left = new FindClosestValueInBST(1);

        root.right = new FindClosestValueInBST(15);
        root.right.left = new FindClosestValueInBST(13);
        root.right.right = new FindClosestValueInBST(22);
        root.right.left.right = new FindClosestValueInBST(14);

    }

    @Test
    void findClosestValueInBst() {
        int expected = 13;
        int actual = root.findClosestValueInBst(root, 12);
        assertEquals(expected, actual);
    }

    @Test
    void findClosestValueInBstRecursive() {
        int expected = 13;
        int actual = root.findClosestValueInBstRecursive(root, 12);
        assertEquals(expected, actual);
    }
}
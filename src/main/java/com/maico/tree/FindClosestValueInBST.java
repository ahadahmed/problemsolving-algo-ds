package com.maico.tree;

public class FindClosestValueInBST {

    public int value;
    public FindClosestValueInBST left;
    public FindClosestValueInBST right;


    public FindClosestValueInBST(int value) {
        this.value = value;
        this.left = null;
        this.right = null;

    }

    public int findClosestValueInBst(FindClosestValueInBST tree, int target) {

        int closestValue = tree.value;
        FindClosestValueInBST currentNode = tree;

        if (target == tree.value) {
            return tree.value;
        }

        while (currentNode != null) {
            int prevAbsDiff = Math.abs(target - closestValue);
            int currentAbsDiff = Math.abs(target - currentNode.value);
            if (currentAbsDiff <= prevAbsDiff) {
                closestValue = currentNode.value;
            }

            if (target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                currentNode = currentNode.left;
            }


        }


        return closestValue;

    }

    public int findClosestValueInBstRecursive(FindClosestValueInBST tree, int target) {
        return findClosestValueInBstRecursive(tree, target, tree.value);
    }

    public int findClosestValueInBstRecursive(FindClosestValueInBST tree, int target, int closeValue) {

        if (tree == null) {
            return closeValue;
        }
        if (Math.abs(target - tree.value) < Math.abs(target - closeValue)) {
            closeValue = tree.value;
        }

        if (target > tree.value) {
            return findClosestValueInBstRecursive(tree.right, target, closeValue);

        } else {
            return findClosestValueInBstRecursive(tree.left, target, closeValue);
        }


    }


}

package com.maico.hackerrank.problemsolving.datastructures.linkedlist;

public class SinglyLinkedList {

    static class Node{
        int data;
        Node nextNode;

        Node(int data){
            this.data = data;
//            this.nextNode = next;
        }
    }

    Node lastNode = null;

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.isertIntoLast(new Node(1));
        singlyLinkedList.isertIntoLast(new Node(2));

//        singlyLinkedList.add(new Node(1));
//        singlyLinkedList.add(new Node(2));
//        System.out.println(singlyLinkedList.getLast().data);
//        singlyLinkedList.forEach(node -> System.out.println(node.data));
    }


    public void isertIntoLast(Node node){
        if(lastNode == null)
            lastNode = node;
        else {
            lastNode.nextNode = node;
            lastNode = node;
        }
    }


    public void iterateList(SinglyLinkedList list){
        while(list.lastNode.nextNode != null){
            System.out.println();
        }
    }
}

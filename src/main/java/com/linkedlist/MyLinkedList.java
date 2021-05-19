package com.linkedlist;

/**
 * Here i have created Class MyLinkedList.
 * It took Inode interface objects(head and tail).
 */
public class MyLinkedList {
    public INode head;
    public INode tail;

    /**
     * Default constructor assigned both head and tail as null.
     */
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * this method will add nodes.
     * added if condition to check tail or head is null...then it'll check the next.
     * @param newNode
     */
    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }

    }

    /**
     * this will print the node.
     */
    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}

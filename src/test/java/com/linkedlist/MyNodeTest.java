package com.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Here i have created a test class.
 * here it will check the linkedList by putting the values.
 */
public class MyNodeTest {
    @Test
    public void given3NumbersWhenLinkedShouldPasedlinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
        Assertions.assertTrue(result);
    }
}

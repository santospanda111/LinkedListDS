package com.linkedlist;

import org.junit.jupiter.api.Test;

/**
 * this test class will check the sorted linkedlist.
 * here i have created an object of sortedlinkedlist class.
 */
public class SortedLinkedListTest {
    @Test
    public void sortTest() {
        SortedLinkedList list=new SortedLinkedList();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        list.display();
    }
}

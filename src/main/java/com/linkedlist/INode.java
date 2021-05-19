package com.linkedlist;

/**
 * Here i have created a generic interface.
 * have two methods get value and set value.
 * @param <K>
 */
public interface INode<K> {
    K getKey();
    void setKey(K Key);

    INode<K> getNext();
    void setNext(INode<K> next);
}

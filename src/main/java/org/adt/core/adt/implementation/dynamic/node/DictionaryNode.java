package org.adt.core.adt.implementation.dynamic.node;



public class DictionaryNode {

    private int key;

    public DictionaryNode(int key, int value, DictionaryNode next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    private int value;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DictionaryNode getNext() {
        return next;
    }

    public void setNext(DictionaryNode next) {
        this.next = next;
    }

    private DictionaryNode next;
    
}

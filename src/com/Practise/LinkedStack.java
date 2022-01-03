package com.Practise;

public class LinkedStack implements Stack {
    Node head;
    Node temp;
    int size;

    private class Node{
        Object data;
        Node next;
        Node(Object data){
            this.data = data;
        }
    }

    @Override
    public void push(Object data) {
        if (head == null){
            head = new Node(data);
            temp = head;
        }
        else {
            temp.next = new Node(data);
            temp = temp.next;
        }
        this.size++;
    }

    @Override
    public Object pop() {
        if (size == 0) throw new IllegalStateException("Stack is empty");
        Node tempNode = head;
        while (tempNode != null){
            if (tempNode.next.next == null){
                Node remove = tempNode.next;
                tempNode.next = null;
                return remove.data;
            }
            tempNode = tempNode.next;
        }
        return null;
    }

    @Override
    public Object peek() {
        if (size == 0) throw new IllegalStateException("Stack is empty");
        Node tempNode = head;
        while (tempNode != null){
            if (tempNode.next == null){
                return tempNode.data;
            }
            tempNode = tempNode.next;
        }
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}

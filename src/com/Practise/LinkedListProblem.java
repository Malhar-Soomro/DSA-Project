package com.Practise;

import com.Practise.Collection.Linked_Collection;
import org.jetbrains.annotations.NotNull;

public class LinkedListProblem {
    Node head;
    Node temp;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
            temp = head;
        } else {
            temp.next = new Node(data);
            temp = temp.next;
        }
    }

    public Node even(@NotNull Node node){
        Node tempNode = new Node(node.data+1);
        Node i = node;
        Node newNode = tempNode;
        i = i.next;
        while (i != null){
            newNode.next = new Node(i.data+1);
            i = i.next;
            newNode = newNode.next;
        }
        return tempNode;
    }

    public void print() {
        for (Node tempNode = head; tempNode != null; tempNode = tempNode.next) {
            System.out.println(tempNode.data);
        }
    }


    public static void main(String[] args) {
        LinkedListProblem linkedList = new LinkedListProblem();
        linkedList.insert(1);
        linkedList.insert(3);
        linkedList.insert(5);
        linkedList.insert(7);
        linkedList.insert(9);
        linkedList.print();
        linkedList.even(linkedList.head);
        Node node = linkedList.even(linkedList.head);
        Node tempNode = node;
        while(tempNode != null){
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }

    }
}
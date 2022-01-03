package com.Practise;

public class LinkedList {
    Node head;
    Node temp;


    private static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }

    }


    public Node insert(int data){
        if (head == null){
            head = new Node(data);
            temp = head;
            return temp;
        }
        temp.next = new Node(data);
        temp = temp.next;
        return temp;
    }
    public void print(){
        for(Node i = head; i != null; i = i.next){
            System.out.println(i.data);
        }
    }


}

package com.Practise.Collection;

public class Linked_Collection extends Abstract_Collection
{

    private int size;
    private Node head = new Node();
    @Override
    public boolean add(Object data)
    {
        head.previous.next=new Node(data,head.previous,head);
        head.previous=head.previous.next;
        size++;
        return true;
    }

    public Object first()
    {
        return head.next.object;
    }


    public Iterator iterator()
    {
        return new Iterator()
        {
            Node cursor=head.next;

            boolean okToRemove;


            @Override
            public boolean hasNext() {
                return cursor != head;
            }

            @Override
            public Object next()
            {
                if(cursor==head)
                    throw new IllegalStateException();

                Object temp=cursor.object;
                cursor=cursor.next;
                okToRemove=true;
                return temp;
            }

            @Override
            public boolean remove()
            {
                if(!okToRemove)
                    throw new IllegalStateException();

                cursor.previous=cursor.previous.previous;
                cursor.previous.next=cursor;
                --size;
                okToRemove=false;
                return true;
            }
        };
    }

    @Override
    public int size() {
        return size;
    }

    public static class Node{
        Object object;
        Node previous, next;
        Node(){ previous = next = this; }
        Node(Object object, Node previous, Node next){
            this.object = object;
            this.previous = previous;
            this.next = next;
        }
    }




}

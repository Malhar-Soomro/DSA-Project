package com.Practise;

public interface Stack {
    public void push(Object data);// add element in the stack
    public Object pop(); // return last element inserted and also remove it
    public Object peek(); // return top element
    public int size(); // return size
    public boolean isEmpty(); // stack empty true otherwise false
}

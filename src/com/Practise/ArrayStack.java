package com.Practise;

import java.util.NoSuchElementException;

public class ArrayStack implements Stack {
    private Object[] array;
    private int size;

    ArrayStack(int capacity){
        this.array = new Object[capacity];
    }
    @Override
    public void push(Object object) {
        if (size == array.length) resize();
        this.array[size++] = object;

    }

    @Override
    public Object pop() {
        if (size == 0) throw new IllegalStateException("Stack is empty");
        Object temp = array[--size];
        array[size] = null;
        return temp;
    }

    @Override
    public Object peek() {
        if (size == 0) throw new IllegalStateException("Stack is empty");
        return array[size - 1];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void resize(){
        Object[] tempObject = array;
        array = new Object[array.length * 2];
        System.arraycopy(tempObject,0,array,0,size);

    }

    public String toString(){
        if (size == 0) throw new IllegalStateException("Stack is empty");
        StringBuffer dataInOneString = new StringBuffer();
        for(int i = 0; i < size; i++){
            dataInOneString.append(array[i]+ " " );
        }
        return dataInOneString.toString();
    }

    public boolean equals(ArrayStack stack){
        if (this.size != stack.size) return false;
        for(int i = 0; i < size; ++i){
            if (this.array[i] == stack.array[i]){
                return true;
            }
        }
        return false;
    }


    public Object findLast() { // O(1)
        if(this.size < 1) throw new NoSuchElementException();
        return this.array[0];
    }

    public LinkedStack toLinkedStack() { // O(n)
        LinkedStack toLinkedStack = new LinkedStack();
        for(int i = 0; i < size; i++) {
            toLinkedStack.push(this.array[i]);
        }
        return toLinkedStack;
    }
}

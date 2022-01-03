package com.Practise.Collection;

public class Array_Collection extends Abstract_Collection{
    Object[] arr = new Object[10];
    int size = 0;
    public boolean add(Object obj){
        if(size==arr.length) resize();
        arr[size++] = obj;
        return  true;
    }
    public  int size(){
        return  size;
    }
    private void resize(){
        Object[] temp = arr;
        arr = new Object[2 * arr.length];
        System.arraycopy(temp, 0, arr, 0, temp.length);
    }

    public Iterator iterator(){
        return new LocalIterator();
    }

    public int frequency(Object obj) {
        Iterator it = iterator();
        int counter = 0;
        while (it.hasNext()){
            if (obj.equals(it.next())){
                ++counter;
            }
        }
        return counter;
    }

    public class LocalIterator implements Iterator{
        private int counter = 0;
        private boolean okToRemove = false;

        public boolean hasNext(){
            return counter<size;
        }
        public Object next(){
            okToRemove = true;
            return arr[counter++];

        }
        public boolean remove(){
            if (!okToRemove) return false;
            arr[--counter] = arr[--size];
            okToRemove = false;
            return true;
        }
    }

}
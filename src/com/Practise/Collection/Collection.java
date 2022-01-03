package com.Practise.Collection;


public interface Collection {
    public boolean add(Object object);
    public Iterator iterator();
    public void clear();
    public boolean contains(Object object);
    public boolean isEmpty();
    public int size();
    public boolean remove(Object object);

    default public void sayHi(){
        System.out.println("hi");
    }

}

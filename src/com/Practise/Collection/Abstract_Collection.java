package com.Practise.Collection;


import java.util.Iterator;

public  abstract  class  Abstract_Collection implements Collection {
    public abstract boolean add(Object obj) ;
    public void clear() {
        if(isEmpty()) throw new IllegalStateException("Collection is empty");
        Iterator it = (Iterator) iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }


    public abstract com.Practise.Collection.Iterator iterator();

    public boolean contains(Object obj){
        if(isEmpty()) throw new IllegalStateException("Collection is empty");
         Iterator it = (Iterator) iterator();
         if(obj==null){
             while(it.hasNext()){
                 if(it.next()==null)return true;
             }
         }
         while(it.hasNext()){
             if(it.next().equals(obj)){
                 return true;
             }
         }
         return false;
     }

     public abstract int size();

    public boolean isEmpty(){
        return size()==0;
    }

    public boolean remove(Object obj){
        Iterator it = (Iterator) iterator();
        if (obj == null){
            while (it.hasNext()){
                if (it.next() == null){
                    it.remove();
                }
            }
            return true;
        }
        while (it.hasNext()){
            if (it.next().equals(obj)) {
                it.remove();
                return true;
            }
            }
        return false;
        }

        public String toString(){
            if(isEmpty()) return "[]";
            StringBuilder sb = new StringBuilder("[");
            Iterator it = (Iterator) iterator();
            while (it.hasNext()){
                sb.append(it.next()).append(",");
            }
            sb.append("]");
            return  sb.toString();
        }
}

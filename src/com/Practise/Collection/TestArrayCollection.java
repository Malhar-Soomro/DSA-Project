package com.Practise.Collection;

import java.util.Iterator;

public class TestArrayCollection {
    public static void main(String[] args) {

        Linked_Collection linked_collection=new Linked_Collection();
        linked_collection.add("Malhar");
        linked_collection.add("Ali");
        linked_collection.add("Aziz");

        linked_collection.add("Rashid");
        linked_collection.add("Badar");

        System.out.println(linked_collection);

        linked_collection.remove("Rashid");

        System.out.println(linked_collection);

    }

}

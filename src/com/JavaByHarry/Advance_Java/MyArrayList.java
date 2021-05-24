package com.JavaByHarry.Advance_Java;

import java.util.*;
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(3);
        myArrayList.add(8);
        myArrayList.add(2);
        for(int i = 0; i < myArrayList.size(); i++){
            System.out.println(myArrayList.get(i));
        }

               }
}

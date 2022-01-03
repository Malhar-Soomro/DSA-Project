package com.OOPLab;

import com.codewithswing.Past_Paper_Qno5;
import org.w3c.dom.ls.LSOutput;

// this , super , inheritance , encapsulation, data abstraction
// through abstract classes and interfaces
class Parent{
    Parent(){
        System.out.println("I am Base class constructor");
    }
    Parent(int x){
        System.out.println("Parametrized Base class constructor");
    }
}
class Derived extends Parent{
    Derived(){
        super(4); // this would call the parametrized constructor of Super class
        System.out.println("I am Child class");
    }
}
class Student{
    String name;
    int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

public class Lab5Tasks {
    public static void main(String[] args) {
//        Task 1
// use this keyword

        //Task 2
        // Write an real world example of inheritance

        //Task 3
        // Example Abstract class

//        Task 4:
//        Example of interface

        Derived derived = new Derived();


    }
}

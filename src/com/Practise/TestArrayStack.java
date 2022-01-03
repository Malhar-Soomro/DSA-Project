package com.Practise;

public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack arrayStack1 = new ArrayStack(10);
        arrayStack1.push("Software");
        arrayStack1.push("Engineering");
        arrayStack1.push("19SW");
        System.out.println(arrayStack1.toString());

        ArrayStack arrayStack2 = new ArrayStack(10);
        arrayStack2.push("Calculus");
        arrayStack2.push("DSA");
        arrayStack2.push("DBS");

        // comparing two stacks
//        System.out.println(arrayStack1.equals(arrayStack2));

        System.out.println(arrayStack2.findLast());

    }
    }

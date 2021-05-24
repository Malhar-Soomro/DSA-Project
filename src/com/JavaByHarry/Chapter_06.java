package com.JavaByHarry;

import java.util.Scanner;

public class Chapter_06 {
    public static void main(String[] args) {
        //arrays
        //arrays are the collection of same datatype

//        there are three ways to create an array in java
//        1. declaration and memory allocation
//       int []array = new int[5];
//        or
//        int array[] = new int[5];

//        2. declaration and then memory allocation
//        int []array;
//        array = new int[5];

// 3. Declaration, memory allocation and initialization together
//        int []array = {33, 44, 66, 83, 27};

//        accessing arrays
//        System.out.println(array[3]);

//        length of an array
//        System.out.println(array.length);

//        displaying array using for loop
//        System.out.println("Displaying the elements of an array using for loop");
//        for(int i=0; i<array.length; i++){
//            System.out.println(array[i]);
//        }
//        displaying array using for each loop
//        System.out.println("Displaying the elements of an array using for-each loop");
//        for(int elements:array){
//            System.out.println(elements);
//        }
        //quick quiz
//        System.out.println("Displaying elements of an array in reverse order");
//        for(int i=array.length-1; i>=0; i--){
//            System.out.println(array[i]);


        //Multidimensional array
        // 2-D array
        int[][] array = new int[2][3];
        System.out.println("Enter the elements of array");
//        System.out.println(array.length);
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length;j++){
                array[i][j] = sc.nextInt();
        }
        }
        System.out.println("Displaying the elements of array using for loop");

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Displaying the elements of array using for-each loop");
        for(int elements[]:array){
            System.out.println("Elements 0 "+elements[0]);
            System.out.println("Elements 1 "+elements[1]);
            System.out.println("Elements 2 "+elements[2]);


            for(int element:elements){
                System.out.print(element+" ");
            }
            System.out.println();
        }


    }

}

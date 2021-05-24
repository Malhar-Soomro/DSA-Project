package com.JavaByHarry;

import java.util.Scanner;

public class Chapter_04 {
    public static void main(String[] args) {
        //Conditionals if else and conditional operators
//        int age = 22;
//        boolean condition = (age > 18);
//        boolean cond = (age == 5);
//        if(condition){
//            System.out.println("You can vote");
//        }
//        else
//            System.out.println("You can't vote");
        //Logical operators
//        System.out.println("Logical AND operator");
//        if(4 > 2 && 4 > 3){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }

//        System.out.println("Logical OR operator");
//        if(4 > 2 || 4 > 7){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }
//        System.out.println("Logical NOT operator");


//        if(!(4 > 8)){
//            System.out.println("True");
//        }
//        else {
//            System.out.println("False");
//        }

        // if-else-if-else ladder
//        int x = 4;
//        if(x > 2){
//            System.out.println("Hello");
//        }
//
//        else if(x > 3){
//            System.out.println("Hey");
//        }
//        else if (x > 1){
//            System.out.println("bye");
//        }
//        else
//            System.out.println("Good morning");

        // switch

        int age ;
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();
        switch (age){
            case 18:
                System.out.println("You are eligible for vote");
                break;
            case 25:
                System.out.println("You are eligible for vote and also for marriage");
                break;
            case 60:
                System.out.println("You are eligible for vote and also for retirement");
                break;
            default:
                System.out.println("Khush raho!");
        }




    }
}

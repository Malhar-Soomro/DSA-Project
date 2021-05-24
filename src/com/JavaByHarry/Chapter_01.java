package com.JavaByHarry;

import java.util.Scanner;

public class Chapter_01 {
    public static void main(String[] args) {


        //Taking input
                int a, b, sum;
        System.out.println("Enter number 1");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        System.out.println("Enter number 2");
        b = scan.nextInt();
        sum = a + b;
        System.out.println("sum of a and b is "+ sum);
//        boolean c = scan.hasNextFloat();
//        System.out.println(c);
//        String str = scan.nextLine();
//        System.out.println(str);



//        Quick quiz
//        int x, y, z, sum;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the value of x");
//        x = scan.nextInt();
//        System.out.println("Enter the value of y");
//        y = scan.nextInt();
//        System.out.println("Enter the value of z");
//        z = scan.nextInt();
//        sum = x + y + z;
//        System.out.println("Sum is: "+ sum);


//         Exercise 1.1  CBSE
//        int Eng, Che, Bio, Math, Phy;
//        float total, percentage;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter marks in English");
//        Eng = scan.nextInt();
//        System.out.println("Enter marks in Chemistry");
//        Che = scan.nextInt();
//        System.out.println("Enter marks in Biology");
//        Bio = scan.nextInt();
//        System.out.println("Enter marks in Mathematics");
//        Math = scan.nextInt();
//        System.out.println("Enter marks in Physics");
//        Phy = scan.nextInt();
//        total = Phy + Eng + Che + Bio + Math;
//        percentage = (total/500)*100;
//        System.out.println("Percentage is: "+percentage);


    }
}
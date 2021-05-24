package com.JavaByHarry;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {

//         Exercise 1.1  CBSE
        int Eng, Che, Bio, Math, Phy;
        float total, percentage;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks in English");
        Eng = scan.nextInt();
        System.out.println("Enter marks in Chemistry");
        Che = scan.nextInt();
        System.out.println("Enter marks in Biology");
        Bio = scan.nextInt();
        System.out.println("Enter marks in Mathematics");
        Math = scan.nextInt();
        System.out.println("Enter marks in Physics");
        Phy = scan.nextInt();
        total = Phy + Eng + Che + Bio + Math;
        percentage = (total/500)*100;
        System.out.println("Percentage is: "+percentage);


    }
}

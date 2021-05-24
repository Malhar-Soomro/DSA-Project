package com.JavaByHarry;

public class Chapter_07_Practice_Set {
    //pattern 1 using recursion
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fib(int n) {
        /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
        static double cel_to_fahren(double cel){
        double farhenheit = (cel*1.8)+32;
        return farhenheit;
    }
    static int average(int ...args){
        int sum = 0, counter = 0;
        for(int element:args){
            sum+=element;
            counter++;
        }
        return sum/counter;
    }
    static void pattern2(int n){
        for(int x = n; x > 0; x--){
            for(int y = 1; y <= n; y++){
                if(y<=x){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static int sum_0f_n_nums(int n){
        if(n==1){
            return 1;
        }
        else {
            return n + sum_0f_n_nums(n-1);
        }
    }
    static void pattern1(int n){
        for(int x = n; x > 0; x--){
            for(int y = n; y > 0; y--){
                if(y>=x){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //1
//        int num;
//        System.out.println("Enter any number ");
//        Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//        System.out.println("Multiplication table of "+num+" is ");
//        for(int i=1; i<=10;i++){
//            System.out.println(num+"x"+i+" = "+num*i);
//        }

//        2
        //*
        //**
        //***
        //****
//        pattern1(4);

//        3
//        int n;
//        System.out.println("Enter the value of n");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        int num = sum_0f_n_nums(n);
//        System.out.println("Sum of "+n+" natural numbers is "+num);

        //4
        //****
        //***
        //**
        //*
//        pattern2(4);

        //5
//       int f=  fib(6);
//        System.out.println(f);



        //6
//        int avg = average(3,6,9);
//        System.out.println("Average is "+avg);


        //7



        //8


        //9
//        double far = cel_to_fahren(32);
//        System.out.println(far);

//        10
//        int num, sum = 0;
//        System.out.println("Enter any number ");
//        Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//        for(int i = 1; i<=num; i++){
//            sum+=i;
//        }
//        System.out.println(sum);





    }
}

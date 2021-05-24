package com.JavaByHarry;

public class Chapter_07 {
    static int sum(int ...args){
        int sum = 0;
        for(int element:args){
            sum+=element;
        }
        return sum;
    }
    static void change(int []arr){
        arr[0]=44;
    }
    static void suppose(){
        System.out.println("java is object oriented programming language");
    }
    static void suppose(int x){
        System.out.println("java is object oriented programming language "+x);
    }
    static int suppose(int x, int y){
        System.out.println("java is object oriented programming language "+x);
        System.out.println("java is object oriented programming language "+y);
        return 0;
    }
    static int suppose(float x, int y){
        System.out.println("java is object oriented programming language "+x);
        System.out.println("java is object oriented programming language "+y);
        return 0;
    }
    static int logic(int x, int y){
        int z;
        if(x==y){
            System.out.println("Square is ");
            z = x * y;
        }
        else {
            System.out.println("Sum is ");
            z = x + y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5, b = 5;
//        int c = logic(a,b);
//        System.out.println(c);
        //if function is not static
//        Chapter_07 obj = new Chapter_07();
//        int c = obj.logic(a,b);
//        System.out.println(c);

//        method overloading
//        suppose();
//        suppose(8);
//        suppose(4,6);
//        suppose(5.0f,3);

//        passing arrays as argments.. function can change the values of original array
//          because we pass reference of array
//        int array [] = {22,534,332,65};
//        System.out.println("Before running the change function");
//        System.out.println(array[0]);
//        change(array);
//        System.out.println("After running the change function");
//        System.out.println(array[0]);

//        Varagms
//        System.out.println("Sum of nothing is: "+sum());
//        System.out.println("Sum of 2 is: "+sum(2));
//        System.out.println("Sum of 1 and 2 is: "+sum(1,2));
//        System.out.println("Sum of 1, 4, and 2 is: "+sum(1,4,2));
//        System.out.println("Sum of 4, 6, 3 and 2 is: "+sum(4,6,3,2));


    }
}

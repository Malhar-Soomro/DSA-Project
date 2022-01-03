package com.DSA_Lab_Tasks;
//task 3
public class Rectangle_Area {
    private final int length;
    private final int breadth;

    Rectangle_Area(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea(){
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle_Area area = new Rectangle_Area(9,7);
        System.out.println("Area of the rectangle is "+area.returnArea());
    }
}

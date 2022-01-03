package com.DSA_Lab_Tasks;
//task 2

public class Area {
    private int length;
    private int breadth;

    public void setDimensions(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea(){
        return length * breadth;
    }
    public static void main(String[] args) {
        Area area = new Area();
        area.setDimensions(3,4);
        System.out.println("Area of the rectangle is "+area.getArea());
    }
}

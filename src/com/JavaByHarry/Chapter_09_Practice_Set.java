package com.JavaByHarry;
class Cylinder{
    private int radius;
    private int height;

    Cylinder(int height, int radius){
        this.radius = radius;
        this.height = height;
    }
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
    public int getRadius() {
        return radius;
    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
    public int getHeight() {
        return height;
    }
    public void surfaceArea(){
//        System.out.println("Surface area of cylinder is: "+(2*3.14*radius*height)+(2*3.14*radius*radius));
        System.out.format("Surface area of cylinder is: %.2f\n",(2*3.14*radius*height)+(2*3.14*radius*radius));
    }
    public void volume(){
        System.out.println("Volume of cylinder is: "+3.14*radius*radius*height);
    }
}
class Rectangle1{
    private int length;
    private int height;

    public Rectangle1() {
        this.length = 4;
        this.height = 5;
    }

    public Rectangle1(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
class Sphere{
    
}
public class Chapter_09_Practice_Set {
    public static void main(String[] args) {

        //1
//        Cylinder cn = new Cylinder();
//        cn.setHeight(2);
//        cn.setRadius(5);
//        System.out.println("Height of the cylinder is: "+cn.getHeight());
//        System.out.println("Radius of the cylinder is: "+cn.getRadius());

        //2
//        Cylinder cn = new Cylinder();
//        cn.setHeight(2);
//        cn.setRadius(5);
//        cn.surfaceArea();
//        cn.volume();

        //3
//        Cylinder cn = new Cylinder(3,4);
//        System.out.println("Height of the cylinder is: "+cn.getHeight());
//        System.out.println("Radius of the cylinder is: "+cn.getRadius());

        //4
//        Rectangle1 rc = new Rectangle1();
//        Rectangle1 rc = new Rectangle1(6,7);
//        System.out.println(rc.getHeight());
//        System.out.println(rc.getLength());




    }
}

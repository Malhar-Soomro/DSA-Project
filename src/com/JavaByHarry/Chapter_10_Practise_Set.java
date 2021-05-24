package com.JavaByHarry;
class Rectangle2{
    int l, w, h;

    public void setL(int l) {
        this.l = l;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void area(){
        System.out.println("Area of Rectangle is "+l*w);
    }
    public void volume(){
        System.out.println("Area of Rectangle is "+l*w*h);
    }
//    public void perimeter(){
//        System.out.println("Perimeter of a Rectangle is "+2*(l+w));
//    }
}
class Cuboid extends Rectangle2{
    @Override
    public void area() {
        System.out.println("Area of cuboid is ");
    }

    @Override
    public void volume() {

    }
}
class Circle1{
    int radius;
    float PI= 3.14f;

    Circle1(int radius){
        this.radius=radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void area(){
//        System.out.println("Area of circle is "+PI*radius*radius);
//        System.out.format("Area of circle is %.2f "+PI*radius*radius);
        System.out.printf("Area of circle is %.2f ",PI*radius*radius);
        System.out.println();
    }

}
class Cylinder1 extends Circle1{
    int height;
    Cylinder1(int radius, int height){
        super(radius);
        this.height=height;
    }

    public int setRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void area() {
//        System.out.println("The are of cylinder is "+2*PI*radius*height+2*PI*radius*radius);
        System.out.printf("The are of cylinder is  %.2f  ",2*PI*radius*height+2*PI*radius*radius);
    }
}
public class Chapter_10_Practise_Set {
    public static void main(String[] args) {
        //1
//        Circle1 c1 = new Circle1(8);
//        c1.setRadius(3);
//        c1.area();
//        Cylinder1 cylinder1 = new Cylinder1(4,5);
//        cylinder1.setRadius(5);
//        cylinder1.setHeight(3);
//        cylinder1.area();

//        System.out.println(cylinder1.radius);
//        System.out.println(c1.radius);
        //2



    }
}

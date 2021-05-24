package com.JavaByHarry;
class Circle{
    int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void area(){
        System.out.println("Area of circle is "+3.14*radius*radius);
    }
    public void perimeter(){
        System.out.println("Perimeter of a Rectangle is "+2*radius*3.14);
    }
}

class TommyVecetti{
    void hitting(){
        System.out.println("hitting...");
    }void running(){
        System.out.println("running...");
    }void firing(){
        System.out.println("firing...");
    }
}
class Rectangle{
    int l, w;

    public void setL(int l) {
        this.l = l;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void area(){
        System.out.println("Area of Rectangle is "+l*w);
    }
    public void perimeter(){
        System.out.println("Perimeter of a Rectangle is "+2*(l+w));
    }
}

class Square{
    int side;

    public void setSide(int side) {
        this.side = side;
    }
    public void area(){
        System.out.println("Area of square is "+side*side);
    }
    public void perimeter(){
        System.out.println("Perimeter of a square is "+4*side);
    }
}
class CellPhone{
    void ring(){
        System.out.println("Ringing...");
    }
    void vibrate(){
        System.out.println("Vibrating...");
    }
}
class Employee1{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Chapter_08_Practice_Set {
    public static void main(String[] args) {

//        1
//        Employee1 person = new Employee1();
//        person.id=4;
//        person.setName("Ahmed");
//
//        System.out.println("Id of the person is: "+person.getId());
//        System.out.println("Name of the person is: "+person.getName());

        //2
//        CellPhone phone = new CellPhone();
//        phone.ring();
//        phone.vibrate();

        //3
//        Square sq = new Square();
//        sq.side=5;
//        sq.area();
//        sq.perimeter();

        //4
//        Rectangle rc = new Rectangle();
//        rc.setL(4);
//        rc.setW(3);
//        rc.area();
//        rc.perimeter();

        //5
//        TommyVecetti tm = new TommyVecetti();
//        tm.running();
//        tm.hitting();
//        tm.firing();

        //6
//        Circle c = new Circle();
//        c.setRadius(4);
//        c.area();
//        c.perimeter();

    }
}

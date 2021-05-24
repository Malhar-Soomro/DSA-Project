package com.JavaByHarry;

class Phone{
    public void showTime(){
        System.out.println("It is 9 pm");
    }
    public void on(){
        System.out.println("Phone is turning on");

    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    @Override
    public void on(){
        System.out.println("Smartphone is turning on");
    }
}
class Base{
    int x;

    public int getX() {
        System.out.println("Setting variable of base class");
        return x;
    }

    public void display(){
        System.out.println("Display method of Base class");
    }
    public void setX(int x) {
        this.x = x;
    }
//    Base(){
//        System.out.println("Constructor of base class");
//    }
//    Base(int a){
//        System.out.println("Constructor of base class with value of a: "+a);
//    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    @Override
    public void display(){
        System.out.println("Display method of Derived class");
    }

    public void setY(int y) {
        System.out.println("Setting variable of derived class");
        this.y = y;
    }
//    Derived(){
//
//        System.out.println("Constructor of Derived class");
//    }
//    Derived(int a, int b){
//        super(3);
//        System.out.println("Constructor of Derived class with value of b: "+b);
//    }
}
class ChildOfDerived extends Derived{
 ChildOfDerived(){
//     super(4,2);
     System.out.println("Constructor of child of derived class");
 }
}
public class Chapter_10 {
    public static void main(String[] args) {
        //Inheritance
        //Creating the object of base class
//        Base b = new Base();
//        b.setX(5);
//        System.out.println(b.getX());

//        Creating the object of derived class
//        Derived d = new Derived();
//        d.setX(12);
//        System.out.println(d.getX());

//        d.setY(44);
//        System.out.println(d.getY());

        //Constructors in Inheritance
//        Base b = new Base();
//        Derived d = new Derived();
//          ChildOfDerived ch = new ChildOfDerived();

//        Constructors overloading in Inheritance
//        Derived d = new Derived(3,4);

        //this and super keyword


        //method overriding
//        Base b = new Base();
//        b.display();
//        Derived d =  new Derived();
//        d.display();

//        Random rn = new Random();
//        float f = rn.nextInt();
//        System.out.println(f);

        //Dynamic method dispatch
        Phone phone = new SmartPhone(); //Allowed
//        SmartPhone smartPhone = new Phone(); // not Allowed
//        phone.music(); // not allowed
          phone.on(); // Method of subclass will invoked
          phone.showTime();
    }
}

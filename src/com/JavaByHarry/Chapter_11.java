package com.JavaByHarry;
interface parentSample{
    void method1();
    void method2();
}
interface childSample extends parentSample{
    void method3();
    void method4();
}
class SampleClass implements childSample {

    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }

    @Override
    public void method3() {
        System.out.println("Method 3");
    }

//    @Override
    public void method4() {
        System.out.println("Method 4");
    }
}
class MyCellPhone{
    void phoneNumber(int number){
        System.out.println("Phone number is"+number);
    }
    void sendMessage(String message){
        System.out.println("Message has been sent:"+message);
    }
}
interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void deleteVideo(){
        System.out.println("Video deleted");
    }
}


interface MyWifi{
    String[] getNetwork();
    void inputPassword(String password);
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi{

    @Override
    public void takeSnap() {
        System.out.println("Taking picture");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video in 4K");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting list of networks");
        String[] networkList = {"PTCL BB", "TENDA", "EVO"};
        return networkList;
    }

    @Override
    public void inputPassword(String password) {
        System.out.println("Input the password"+password);
    }
}
interface Mouse{
    void scrollUp();
    void scrollDown();
    void scrollRight();
    void scrollLeft();
}
class DellMouse implements Mouse{
    @Override
    public void scrollDown() {

    }
    @Override
    public void scrollUp() {

    }
    @Override
    public void scrollLeft() {

    }

    @Override
    public void scrollRight() {

    }
}
abstract class Parent{
    public void print(){
        System.out.println("I am parent class");
    }
    abstract public void  alarm();
}
class Child extends Parent {
    @Override
    public void alarm() {
        System.out.println("bell....");
    }
}
    abstract class Child2 extends Parent {
        public void today() {
            System.out.println("Today is friday");
        }
    }

    class Child3 extends Child2 {
        @Override
        public void alarm() {

        }
}
class A{

}
class B extends A{

}
    public class Chapter_11 {
        public static void main(String[] args) {
            //abstract classes and methods
//        Child child = new Child();
//        child.alarm();
            Child3 child3 = new Child3();
//        Child3.print();
//        Child3.today();

            //Interfaces

            //dynamic method dispatch
//            A a = new B();

            //creating the object of MySmartPhone
//            MySmartPhone smartPhone = new MySmartPhone();
//            String[] arr = smartPhone.getNetwork();
//            for (String item:arr){
//                System.out.println(item);
//            }
//            smartPhone.deleteVideo();

            //inheritance in interface , interfaces can extend another interfaces...
            // remember that interface cannot implement
            // interfaces only class can implement interface...
            //class cannot extend interface
            //interface cannot implement interface

            //creating object of sampleClass
            SampleClass sampleClass = new SampleClass();
//            sampleClass.method1();
//            sampleClass.method2();


        }
    }



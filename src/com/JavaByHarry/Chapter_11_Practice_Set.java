package com.JavaByHarry;
interface TVRemote{

}
interface SmartTVRemote extends TVRemote{

}
class TV implements TVRemote{

}
abstract class Telephone{
    abstract void disconnect();
    abstract void lift();
    abstract void ring();

}
class smartTelephone extends Telephone{
    void method(){
        System.out.println("method in smartTelephone class");
    }
    @Override
    void disconnect() {

    }

    @Override
    void lift() {

    }

    @Override
    void ring() {

    }
}
abstract class Monkey{
    abstract void jump();
    abstract void bite();
}
interface  BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{

    @Override
    void jump() {

    }

    @Override
    void bite() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    void write() { }

    @Override
    void refill() { }

    void changeNib(){}
}
public class Chapter_11_Practice_Set {
    public static void main(String[] args) {
        //1 complete
        //2 complete
        //3 complete
        // 4 complete
        Telephone telephone = new smartTelephone();
        telephone.disconnect();

        //5
        Monkey monkey = new Human();
        monkey.bite();
        monkey.jump();



    }
}

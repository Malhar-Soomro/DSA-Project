//package com.google;
//class MyThread1 implements Runnable{
//        @Override
//    public void run() {
//            for(int i = 0; i<100; i++){
//          System.out.println("Thread1");
//    }
//}
//}
//class MyThread2 implements Runnable{
//    @Override
//    public void run() {
//        for(int i = 0; i<100; i++){
//            System.out.println("Thread2");
//        }
//    }
//}
//public class Thread_Interface {
//    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1();
//        MyThread2 t2 = new MyThread2();
//        Thread thread1 = new Thread(t1);
//        Thread thread2 = new Thread(t2);
//          Thread thread1 = new Thread(new MyThread1());
//          Thread thread2 = new Thread(new MyThread2());
//        thread1.setPriority(10);
//        thread1.setName("Java Thread");
//        System.out.println(thread1.getName());
//        thread1.start();
//        thread2.start();
//    }
//}

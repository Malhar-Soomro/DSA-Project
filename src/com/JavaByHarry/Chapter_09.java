package com.JavaByHarry;

class MyEmployee {
    private int id;
    private int salary;
    private String name;

    MyEmployee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

}
    public class Chapter_09 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
//        MyEmployee harry = new MyEmployee();  // Instantiating a new Employee Object

//        harry.id = 5;
//        harry.name = "CodeWithHarry";
//        harry.salary = 4443; --> throws an error because of private access modifier
//
//        harry.setId(5);
//        harry.setName("CodeWithHarry");
//        harry.setSalary(4222);
//        System.out.println("Id of the employee is: "+harry.getId());
//        System.out.println("Name of the employee is: "+harry.getName());
//        System.out.println("Salary of the employee is: "+harry.getSalary());

        //constructor

        MyEmployee harry = new MyEmployee(5,"CodeWithHarry", 332);
        System.out.println("Id of the employee is: "+harry.getId());
        System.out.println("Name of the employee is: "+harry.getName());
        System.out.println("Salary of the employee is: "+harry.getSalary());

    }
}

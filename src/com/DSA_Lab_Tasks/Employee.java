package com.DSA_Lab_Tasks;
//Task 1

public class Employee {
//    creating instance variables
      private int salary; // salary in dollars
      private int noOfHoursPerDay;

    //Methods
    public void getInfo(int salary, int noOfHoursPerDay){
        this.salary = salary;
        this.noOfHoursPerDay = noOfHoursPerDay;
    }

    public void addSalary(){
        if (salary < 500){
            this.salary = salary + 10;
        }
    }

    public void addWork(){
        if(noOfHoursPerDay > 6){
            this.salary = salary + 5;
        }
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfo(300,10);
        employee.addSalary();
        employee.addWork();

        //final salary
        System.out.println("Final salary of the employee is: $"+employee.getSalary());
    }
}

package com.TaskTwo.Employees;

public class Employee extends Person{
    long employeeID;
    int salary;

    Employee(){  //default constructor
        this.employeeID=0;
        this.salary=0;
    }

    Employee(String name, int age, long employeeID, int salary){  //parametrized constructor
        super(name ,age);                                         //using super keyword initialized the person's name and age
        this.employeeID=employeeID;
        this.salary=salary;
    }
}

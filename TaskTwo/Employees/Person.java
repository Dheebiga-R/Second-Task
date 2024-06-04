package com.TaskTwo.Employees;

public class Person {
    String name;
    int age;

    Person(){  //default constructor
        this. name= "null";
        this.age=0;
    }

    Person(String name,int age){  //Super keyword calls this two parameters constructor from Employee class
        this.name=name;
        this.age=age;
    }

}

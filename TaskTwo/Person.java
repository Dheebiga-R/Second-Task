package com.TaskTwo;

public class Person {
    String name;
    int age;  //We can assign default age here

    Person(){
        this.age=18;  //or else We can assign it in default constructor
    }

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Name: " + this.name +"\nAge: " + this.age);
    }

    public static void main(String[] args) {
        //Here an object will be created with default constructor
        Person person1 = new Person();
        //Printing default age of a person
        System.out.println(person1.age);

        //create an object initialized with name and age
        Person person = new Person("Default name",22);
        person.display();
    }

}



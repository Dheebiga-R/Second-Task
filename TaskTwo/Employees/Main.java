package com.TaskTwo.Employees;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dear candidates welcome to our company!!" + "\nPlease enter your name, age, Employee ID, Salary::");
        //creating an object and passing user input, also initialized the Person class instances
        Employee employee = new Employee(input.next(),input.nextInt(),input.nextInt(),input.nextInt());

        //Printing person name and age
        System.out.println("Person name:: " + employee.name + "\nPerson age:: " + employee.age);
    }
}

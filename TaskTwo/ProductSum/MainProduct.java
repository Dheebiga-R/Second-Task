package com.TaskTwo.ProductSum;
//import scanner to get the user input

import java.util.Scanner;

//Main function in different class
public class MainProduct {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        //creating an object of product in an array of size 5
        Product[] array = new Product[5];

        int max=Integer.MIN_VALUE;  //To find the highest price, the max variable initialized to min value
        int index=0;                //To find the product id of that maximum price product.Initialized to zero

        for(int i=0;i<5;i++){                                                         //to get the five product information
            System.out.println("Enter Product "+ (i+1) + " information::");
            array[i] = new Product(input.nextInt(),input.nextInt(),input.nextInt());  //Creating an object for every 5 product, get the user input and pass it
            if(array[i].price > max){                                                 //Condition to check the highest price
                max = array[i].price;
                index = i;
            }
        }
        System.out.println("Pid of the product with highest price is::" + array[index].pid);  //Print the highest price product ID

        for(int i=0;i<5;i++){                         //Display the inputs of five product information
            System.out.println(array[i].toString());
        }

        TotalAmount amount = new TotalAmount();  //Creating a new object from different class to display the total amount of all products
        System.out.println("Total amount spent on all products is::" + amount.display(array));
    }
}
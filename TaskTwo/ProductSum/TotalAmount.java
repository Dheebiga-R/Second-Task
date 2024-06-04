package com.TaskTwo.ProductSum;

//creating a TotalAmount class to display total amount spent on all products
public class TotalAmount {
    TotalAmount(){

    }

    //method to display amount
    public int display(Product[] array){  //array of product's object as argument
        int sum = 0;
        for(int i=0;i<5;i++){
            sum = sum + array[i].price * array[i].quantity;  //To find total amount
        }
        return sum;  //return total amount
    }
}

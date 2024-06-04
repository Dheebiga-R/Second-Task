package com.TaskTwo.ProductSum;

//create a class product
public class Product {

    //instance variable of the product class
    int pid;
    int price;
    int quantity;

    //default constructor of a product class
    Product(){
        this.pid=0;
        this.price=0;
        this.quantity=0;
    }

    //Parametrized constructor -- to get the inputs from the user and store it in an object
    Product(int pid,int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    //To display the information
    @Override //override annotation is used to override the default toString() method
    public String toString() {
        return "{pid :" + this.pid + ", price :" + this.price + ", quantity :" + this.quantity + "}";
    }
}

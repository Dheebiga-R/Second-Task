package com.TaskTwo;
import java.util.Scanner;

//creating an Account class
public class Account {

    //instance variables for class
    double Balance;
    long accountNumber;

    Account(){  //default constructor
        this.Balance=0;
        this.accountNumber=0;
    }

    Account(double Balance,long accountNumber){  //parametrized constructor
        this.Balance = Balance;
        this.accountNumber = accountNumber;
    }

    public double deposit(double amount){  //method to deposit amount
        if(amount>0) {                     //If amount is greater than zero, add it in account
            this.Balance = this.Balance + amount;
        }
        return this.Balance;
    }

    public double withdraw(double amount){  //method to withdraw amount
        if(amount<=this.Balance) {          //If withdraw amount is less than or equal to balance,withdraw is possible
            this.Balance = this.Balance - amount;
        }
        else{                               //otherwise it won't
            System.out.println("Not have enough balance to withdraw!!");
        }
        return this.Balance;
    }

    public void display(){  //Method to display the Account balance
        System.out.println("Balance amount:: " + this.Balance);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Account balance and Account number::");
        Account account = new Account(input.nextDouble() , input.nextInt());  //creating an object and passing user inputs

        System.out.println("Enter a amount to deposit into your account::");
        System.out.println("Total amount:: " + account.deposit(input.nextDouble()));

        System.out.println("Enter a amount to withdraw from your account::");
        System.out.println("Balance amount:: " + account.withdraw(input.nextDouble()));

        System.out.println("Balance Detail of your account::");
        account.display();
    }

}


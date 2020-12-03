package BankATM;
import java.util.Scanner;

public class Bank {
    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerLastname;
    private String customerMiddlename;

    Bank(String nameC, String middlenameC, String lastnameC, int balanceC){
        customerName = nameC;
        customerLastname = middlenameC;
        customerLastname = lastnameC;
        balance = balanceC;

    }
    void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        }else if (previousTransaction < 0){
            System.out.println("Withdrawn: " + Math.abs (previousTransaction));
        } else System.out.println("No Transaction occured.");
    }

    }


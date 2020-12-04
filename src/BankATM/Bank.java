package BankATM;
import java.util.Scanner;

public class Bank {
    private int balance;
    private int previousTransaction;
    private final String customerName;
    private final String customerLastname;
    private final String customerMiddlename;

    Bank(String nameC, String middlenameC, String lastnameC, int balanceC){
        customerName = nameC;
        customerMiddlename = middlenameC;
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

    void bankingMenu(){
        char option = '\0';
        Scanner scanner = new Scanner (System.in);

        System.out.println("********* WELCOME TO MELIKINHO'S BANK *********");
        System.out.println("********* WELCOME *********" + customerName + "" + customerMiddlename + "" + customerLastname);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("A.) Check Balance");
        System.out.println("B.) Deposit cash onto ATM");
        System.out.println("C.) Withdraw cash from ATM");
        System.out.println("D.) See your previous transaction: ");
        System.out.println("E.) Exit your BANK ATM");

        do {
            System.out.println("************************************");
            System.out.println("Enter your option A to E");
            option = scanner.next ().charAt (0);
            System.out.println("\n");

            switch (option){
                case 'A':
                    System.out.println("*********");
                    System.out.println("Balance: " + balance);
                    System.out.println("*********");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("*********");
                    System.out.println("Enter an amount to deposit cash: ");
                    System.out.println("*********");
                    int amount = scanner.nextInt ();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println ("*********");
                    System.out.println("Enter an amount to withdraw cash: ");
                    int amountwithdraw = scanner.nextInt ();
                    withdraw (amountwithdraw);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("*********");
                    getPreviousTransaction ();
                    break;
                case 'E':
                    System.out.println("*********");
                    break;
                default:
                    System.out.println("*********");
                    System.out.println("Invaild option. Please choose A - E and try again!");
                    break;


            }
        }while(option != 'E');
        System.out.println("Thank you for using our services. Welcome back!");
        System.out.println("********* BANK MELIKINHO *********");


    }

    }


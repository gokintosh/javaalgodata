package com.gokul.chapter1.creditcard;

public class CreditCard {

//    these are instance variables
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

//    create constructors

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

//    create a default constructor with 0 balance

    public CreditCard(String customer, String bank, String account, int limit) {
        this(customer,bank,account,limit,0.0);
    }

//    accessor methods

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }
//    charge the card
    public boolean charge(double price){
        if(balance+price>limit){
            return false;
        }
        balance+=price;
        return true;
    }

//    make payment
    public void makePayment(double amount){
        balance-=amount;
    }

//    utility methods
    public static void printSummary(CreditCard card){
        System.out.println("Customer :"+card.customer);
        System.out.println("Bank :"+card.bank);
        System.out.println("Account :"+card.account);
        System.out.println("Limit :"+card.limit);
        System.out.println("Balance :"+card.balance);
        System.out.println("\n");
    }

}

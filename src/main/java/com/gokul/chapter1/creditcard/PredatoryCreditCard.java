package com.gokul.chapter1.creditcard;

public class PredatoryCreditCard extends CreditCard {

//    add new instance variable
    private double apr; //annual percentage rate

//    constructor for this class


    public PredatoryCreditCard(String customer, String bank, String account, int limit, double balance, double apr) {
        super(customer, bank, account, limit, balance);
        this.apr = apr;
    }

//    new method for accessing monthly interest charges
    public void processMonth(){
        if(balance>0){
            double monthlyFactor=Math.pow(1+apr,1.0/12);
            balance*=monthlyFactor;
        }
    }

//    overriding the charge method defined in the super class
    public boolean charge(double price){
        boolean isSuccess=super.charge(price);
        if(!isSuccess)
            balance+=5;
        return isSuccess;
    }
}

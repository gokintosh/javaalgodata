package com.gokul.chapter1.creditcard;

import java.util.ArrayList;

public class CreditCardImpl {
    public static void main(String[] args) {
        CreditCard[] wallet=new CreditCard[4];
        wallet[0]=new CreditCard("Gokul Nair", "Millenium", "1234goku1", 20000, 18000);
        wallet[1]=new CreditCard("Soham Kurwa", "PEKAO", "334876thu", 15000, 10000);
        wallet[2]=new CreditCard("Szymon Koran", "Bank Polski", "44657jff87", 14000, 1000);
        wallet[3]=new CreditCard("Lapid Upadyay", "Santander", "fhfufj8763m", 10000, 5000);

        wallet[3].makePayment(3000);



        for(CreditCard card:wallet){

            CreditCard.printSummary(card);

        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Bank usBank = new Bank();
       Bank bankOfAmerica = new Bank();

        usBank.setName("Colorado");
        usBank.setCashInVault(100000);

        bankOfAmerica.setName("California");
        bankOfAmerica.setCashInVault(100000);

        usBank.deposit(1000);
        usBank.deposit(560);

        bankOfAmerica.deposit(600);
        bankOfAmerica.deposit(340);

        usBank.withdrawal(60);
        usBank.withdrawal(436);

        bankOfAmerica.withdrawal(67);
        bankOfAmerica.withdrawal(275);
    }


    }

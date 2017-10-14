package com.java.synchronization.inter_thread_communication;

public class Customer {

    long account_balance  = 25000;

    synchronized void withdraw(long amount){

        System.out.println("Ready to withdraw");
        if(account_balance < amount){
            System.out.println("Less balance waiting for deposit");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        account_balance -= amount;
        System.out.println("Withdraw completed !");
    }

    synchronized void deposite(long amount){
        System.out.println("Start deposit");
        account_balance += amount;
        System.out.println("Deposited to your account...");
        notify();
    }
}

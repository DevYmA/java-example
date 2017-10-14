package com.java.synchronization.inter_thread_communication;


public class TestCutomer {

    public static void main(String[] args) {
        Customer customer = new Customer();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                customer.withdraw(40000);
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                customer.deposite(50000);
            }
        };
        t1.start();
        t2.start();
    }

}

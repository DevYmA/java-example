package com.java.synchronization;

public class AccountTest {

    public static void main(String[] args) {

        Account a1 = new Account(1001);
        Account a2 = new Account(2002);

        /*
        //doesn't work synchronize.because java provide lock for object.different
        object different lock .If you want to use unique lock then you can use static synchronization
        Thread t1 = new Thread(){
            @Override
            public void run() {
                a1.updateAmount(1001);
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                a2.updateAmount(2002);
            }
        };*/

        //Same object.same lock
        Thread t1 = new Thread(){
            @Override
            public void run() {
                a1.updateAmount(1001);
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                a1.updateAmount(2002);
            }
        };

        Thread t3 = new Thread(){
            @Override
            public void run() {
                a1.viewAccout(3003);
            }
        };

        t1.start();
        t2.start();
        t3.start();

    }
}

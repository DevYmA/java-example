package com.java.threads;

public class CurrentThreadTest {

    public static void main(String[] args) {

        CurrentThread ct1 = new CurrentThread();
        CurrentThread ct2 = new CurrentThread();
        ct1.start();
        ct2.start();

    }
}

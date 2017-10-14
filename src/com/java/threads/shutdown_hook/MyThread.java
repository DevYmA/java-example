package com.java.threads.shutdown_hook;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("I doing something before shutdown");
    }
}

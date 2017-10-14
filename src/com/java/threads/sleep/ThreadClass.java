package com.java.threads.sleep;

public class ThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("This is a override run method");
    }

    /*@Override
    public synchronized void start() {
        System.out.println("This is a override start method");
    }*/
}

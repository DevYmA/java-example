package com.java.threads;

public class RunnableClass implements Runnable{

    @Override
    public void run() {
        System.out.println("Threading is start | This is a run method");
    }

}

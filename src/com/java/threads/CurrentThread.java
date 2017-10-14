package com.java.threads;

public class CurrentThread extends  Thread{


    @Override
    public void run() {
        System.out.println("This is a current thread name : "+Thread.currentThread().getName());
        System.out.println("This is a current thread priority : "+Thread.currentThread().getPriority());
    }
}

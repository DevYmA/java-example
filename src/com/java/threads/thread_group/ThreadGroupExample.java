package com.java.threads.thread_group;

public class ThreadGroupExample implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupExample runnable = new ThreadGroupExample();

        ThreadGroup group = new ThreadGroup("Thread Group");

        Thread t1 = new Thread(group,runnable,"one");
        t1.start();
        Thread t2 = new Thread(group,runnable,"two");
        t2.start();
        Thread t3 = new Thread(group,runnable,"three");

        System.out.println("Group name :"+group.getName());
        group.list();

    }
}

package com.java.threads.shutdown_hook;

public class ShutdownHookExample {

    public static void main(String[] args) {
        MyThread m = new MyThread();

        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(m);

        System.out.println("I'm going to shutdown");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

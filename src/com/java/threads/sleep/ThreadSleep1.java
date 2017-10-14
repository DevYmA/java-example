package com.java.threads.sleep;

public class ThreadSleep1 extends Thread{

    private int i;

    public ThreadSleep1(int i){
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println("Start ThreadSleep1 "+i);
        for (int i = 0; i < 5; i++) {
            System.out.println("Sleeping "+i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Woke up "+i);
        }
    }

    public static void main(String[] args) {

        ThreadSleep1 ts1 = new ThreadSleep1(1);
        System.out.println("***************");
        ThreadSleep1 ts2 = new ThreadSleep1(2);
        ts1.start();
        ts2.start();
        //ts2.start();We can't run same threads twice.if we run illegal exception throws


    }
}

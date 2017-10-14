package com.java.threads;

public class DaemonThreads extends Thread {

    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("I am a Daemon Thread");
        }else{
            System.out.println("I am a User Thread");
        }
    }


    public static void main(String[] args) {
        DaemonThreads d1 = new DaemonThreads();
        DaemonThreads d2 = new DaemonThreads();

        d1.setDaemon(true);

        d2.start();
        d1.start();


        //d2.setDaemon(true);occur error
    }
}

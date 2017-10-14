package com.java.synchronization.dead_lock;

public class User {

    public void accessUser(int threadNO){
        synchronized (Integer.class){
            System.out.println("I've got outer lock.I'm "+threadNO);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (String.class){
                System.out.println("I've got inner lock.I'm "+threadNO);
            }
        }
    }

    public void viewUser(int threadNO){
        synchronized (String.class){
            System.out.println("I've got outer lock.I'm "+threadNO);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Integer.class){
                System.out.println("I've got inner lock.I'm "+threadNO);
            }
        }
    }

}

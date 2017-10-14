package com.java.synchronization;

public class Account {

    private int accountNo;

    public Account(int accountNo){
        this.accountNo = accountNo;
    }

    //Only unique for object
    public synchronized void updateAmount(int t){

        for (int i = 1; i < 15; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t +" Step "+i);
        }

    }

    /*
    This lock unique whole class
    public synchronized static void updateAmount(int t){

        for (int i = 1; i < 15; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t +" Step "+i);
        }

    }*/

    public void viewAccout(int s){
        for (int i = 0; i < 5; i++) {
            System.out.println(s+" I looking account"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.java.threads.join;

public class JoinThreadTime {

    public static void main(String[] args) {

        JoinThread1 jt1 = new JoinThread1();
        JoinThread1 jt2 = new JoinThread1();
        JoinThread1 jt3 = new JoinThread1();

        jt1.start();
        try {
            jt1.join(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jt2.start();
        jt3.start();

    }

}

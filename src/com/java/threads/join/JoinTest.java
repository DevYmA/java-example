package com.java.threads.join;

public class JoinTest {

    public static void main(String[] args) {

        JoinThread1 jt1 = new JoinThread1();
        JoinThread1 jt2 = new JoinThread1();
        JoinThread1 jt3 = new JoinThread1();
        System.out.println("Name of jt1 : "+jt1.getName());
        System.out.println("Id of jt2 : "+jt1.getId());
        jt3.setName("3rd Thread");
        jt1.start();

        try {
            jt1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        jt2.start();
        jt3.start();
        System.out.println("Name of jt2 : "+jt2.getName());
        System.out.println("Name of jt3 : "+jt3.getName());
    }

}

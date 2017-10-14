package com.java.synchronization.dead_lock;

public class DeadLockTest {

    public static void main(String[] args) {

        User user = new User();
        User user2 = new User();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                user.accessUser(5005);
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                user.viewUser(7007);
            }
        };

        Thread t3 = new Thread(){
            @Override
            public void run() {
                user.viewUser(8008);
            }
        };

        t1.start();
        t2.start();
        t3.start();

    }
}

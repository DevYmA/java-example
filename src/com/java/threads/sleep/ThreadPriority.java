package com.java.threads.sleep;

import com.java.threads.CurrentThread;

public class ThreadPriority {

    public static void main(String[] args) {
        CurrentThread t1 = new CurrentThread();
        CurrentThread t2 = new CurrentThread();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t2.start();
        t1.start();
    }
}

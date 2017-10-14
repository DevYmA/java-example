package com.java.threads.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {

        ExecutorService exe = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            WorkerThread worker = new WorkerThread(String.valueOf(i));
            exe.execute(worker);
            System.out.println(i);
        }
        System.out.println(exe.isShutdown());
    }
}

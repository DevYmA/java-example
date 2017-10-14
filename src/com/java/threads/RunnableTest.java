package com.java.threads;

public class RunnableTest {

    public static void main(String[] args) {
        RunnableClass rc = new RunnableClass();
        //rc.run();//Doesn't run as multi thread
        Thread t = new Thread(rc);
        t.start();


    }

}

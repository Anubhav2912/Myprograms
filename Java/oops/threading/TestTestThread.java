package com.anu.learning.oops.threading;

public class TestTestThread {
    public static void main(String[] args) throws Exception {
        Thread t1 = new TestThread1("First");
        Thread t2 = new TestThread1("Second");
        Thread t3 = new TestThread1("Third");
        t1.start();
        t2.start();
        t3.start();
    }
}

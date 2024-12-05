package com.anu.learning.oops.threading;

public class TestThread1 extends Thread {
    private String threadName;

    public TestThread1() {
        super();
    }

    public TestThread1(String threadName) {
        this.setName(threadName);
    }

    @Override
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("Thread :" + this.getName());
            i++;
            try {
                TestThread1.sleep(50);
            } catch (Exception e) {

            }
        }
    }
}


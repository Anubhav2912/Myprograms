package com.anu.learning.oops.threading.producerconsumer;

public class Consumer extends Thread {

    private Company company;

    public Consumer(Company company) {
        this.company = company;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                company.consume();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
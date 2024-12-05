package com.anu.learning.oops.threading.producerconsumer;

public class Company {

    private String item;

    boolean flag = false;

    public synchronized void produce(String item) throws InterruptedException {
        if (flag == true) {
            wait();
        }
        System.out.println("Produced :" + item);
        this.item = item;
        flag = true;
        notify();
    }

    public synchronized String consume() throws InterruptedException {
        if (flag == false) {
            wait();
        }
        System.out.println("Consumed :" + this.item);
        flag = false;
        notify();
        return this.item;
    }
}

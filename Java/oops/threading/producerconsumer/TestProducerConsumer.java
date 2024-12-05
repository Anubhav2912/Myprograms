package com.anu.learning.oops.threading.producerconsumer;

public class TestProducerConsumer {

    public static void main(String[] args) {
        Company company = new Company();
        Producer producer = new Producer(company);
        Consumer consumer = new Consumer(company);
        producer.start();
        consumer.start();
    }
}

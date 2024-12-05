package com.anu.learning.oops.demointerface;

public class TestDemo {
    public static void main(String[] args) {
        Demo c = new DemoChild1();
        Demo v = new DemoChild2();
        Demo n = new DemoChild1();
        Demo w = new DemoChild2();
        c.alphabet();
        n.numeric();
        v.alphabet();
        w.numeric();
    }
}

package com.anu.learning.oops.demointerface;

public interface Demo {
    void alphabet();

    void numeric();
}

class DemoChild1 implements Demo {
    @Override
    public void alphabet() {
        System.out.println("B, C, D, F  etc. are consonants");
    }

    @Override
    public void numeric() {
        System.out.println("1 to infinity are Natural numbers");
    }
}

class DemoChild2 implements Demo {
    @Override
    public void alphabet() {
        System.out.println("A, E, I, O, U are vowels");
    }

    @Override
    public void numeric() {
        System.out.println("0 to infinity are Whole Numbers");
    }
}

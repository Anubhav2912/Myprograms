package com.anu.learning.oops.inheritence;

public class Derived extends Base {
    private int a = 50;
    private int b = 60;
    protected int c = 70;

    public int d = 80;


    public Derived() {
        super();
        System.out.println("Derived Default Constructor");
        System.out.println(super.c);
        System.out.println(this.c);
        System.out.println(super.d + " " + this.d);
    }

    @Override
    public void display() {
        System.out.println("Child Display");
    }

    @Override
    public void show() {
        System.out.println("Child Show");
    }
}

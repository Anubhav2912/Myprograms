package com.anu.learning.oops.inheritence;

public class Base {
    private int a = 10;
    private int b = 20;
    protected int c = 30;

    public int d = 40;


    public Base() {
        System.out.println("Base Default Constructor");
        System.out.println(this.a + " " + this.b);
    }

    public void display() {
        System.out.println("Display");
    }

    public void show() {
        System.out.println("Show");
    }

}

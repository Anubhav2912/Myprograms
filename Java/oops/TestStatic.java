package com.anu.learning.oops;

public class TestStatic {
    //instance variable
    private int instance = 10;

    //static variable
    private static int stat = 20;

    //static block
    static {
        System.out.println("static block 1");
    }

    //instance block
    {
        System.out.println("instance block 1");
    }

    //static block
    static {
        System.out.println("static block 2");
    }

    //instance block
    {
        System.out.println("instance block 2");
    }


    //constructor
    public TestStatic() {
        System.out.println("constructor");
    }

    //instance method
    public void display() {
        System.out.println(instance);
        System.out.println(stat);
    }

    //static method
    public static void show() {
        System.out.println(stat);
    }

    //writing a static inner class within a class but no external class can be static
    static class Inner {
        public void method() {
            System.out.println("Method");
        }
    }

    //main method
    public static void main(String[] args) {
        System.out.println("main");
        System.out.println("creating object in next line");
        TestStatic testStatic = new TestStatic();
        testStatic.display();
        TestStatic.show();
    }

}

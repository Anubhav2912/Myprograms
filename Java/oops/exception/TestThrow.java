package com.anu.learning.oops.exception;

public class TestThrow {
    public void findsquare(int num) {
        if (num < 1) {
            throw new ArithmeticException("Number is negative, cannot find square");
        } else {
            System.out.println("Square of " + num + " is " + (num * num));
        }
    }
}

class TestTestThrow {
    public static void main(String[] args) {
        TestThrow obj = new TestThrow();
        obj.findsquare(-3);
    }
}
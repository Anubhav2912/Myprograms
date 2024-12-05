package com.anu.learning.oops.exception;

public class TestException {
    public static void main(String[] args) {

        try {
            int p = 10 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Divide by zero exception");
        } finally {
            System.out.println(10 / 2);
        }


    }
}

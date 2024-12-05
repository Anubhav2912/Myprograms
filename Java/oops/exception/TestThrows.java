package com.anu.learning.oops.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestThrows {
    public int divideNum(int a, int b) throws ArithmeticException, InputMismatchException {
        int div = a / b;
        return div;
    }
}

class TestTestThrows {
    public static int a, b;
    public static void main(String[] args) {
        int quot;
        TestThrows obj = new TestThrows();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Input first number : ");
            a = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Please enter integer type value");
        }

        try{
            System.out.println("Input second number : ");
            b = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Please enter integer type value");
        }
        if (b == 0) {
            try {
                obj.divideNum(a, b);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide a number by 0");
            }
        } else {
            quot = obj.divideNum(a, b);
            System.out.println("Division of " + a + " and " + b + " is " + (quot));
        }

    }
}
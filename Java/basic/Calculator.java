package com.anu.learning.basic;

import java.util.Scanner;

public class Calculator {


    public static int add(int a, int b) {
        System.out.println(a + b);
        return 0;
    }

    public static int subtract(int a, int b) {
        System.out.println(a - b);
        return 0;
    }

    public static int multiply(int a, int b) {
        System.out.println(a * b);
        return 0;
    }

    public static int divide(int a, int b) {
        System.out.println(a / b);
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, option;
        System.out.println("Enter the first number : ");
        a = input.nextInt();
        System.out.println("Enter the second number : ");
        b = input.nextInt();
        System.out.println("Choose your operation: \n 1 for addition\n 2 for subtraction\n 3 for multiplication\n 4 for division");
        option = input.nextInt();
        if (option == 1) {
            System.out.println("Sum is ");
            add(a, b);
        } else if (option == 2) {
            System.out.println("Difference is ");
            subtract(a, b);
        } else if (option == 3) {
            System.out.println("Product is ");
            multiply(a, b);
        } else if (option == 4) {
            System.out.println("Division is ");
            divide(a, b);
        } else {
            System.out.println("Wrong Option selected");
        }
    }
}

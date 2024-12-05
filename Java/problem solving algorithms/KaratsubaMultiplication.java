package com.anu.learning.pla;

import java.util.Scanner;
public class KaratsubaMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int y = scanner.nextInt();

        int result = karatsuba(x, y);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static int karatsuba(int x, int y) {
        // Base case for small numbers
        if (x < 10 || y < 10) {
            return x * y;
        }

        int n = Math.max(Integer.toString(x).length(), Integer.toString(y).length());
        int half = n / 2;

        // Split x and y into high and low parts
        int high1 = x / (int)Math.pow(10, half);
        int low1 = x % (int)Math.pow(10, half);
        int high2 = y / (int)Math.pow(10, half);
        int low2 = y % (int)Math.pow(10, half);

        // Recursively compute the three products
        int z0 = karatsuba(low1, low2);
        int z1 = karatsuba((low1 + high1), (low2 + high2));
        int z2 = karatsuba(high1, high2);

        // Combine the results
        return z2 * (int)Math.pow(10, 2 * half) + (z1 - z2 - z0) * (int)Math.pow(10, half) + z0;
    }
}

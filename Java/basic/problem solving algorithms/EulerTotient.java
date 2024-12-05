package com.anu.learning.pla;

import java.util.*;

class EulerTotient {

    public void computeTotient(int n) {
        long sum = 0;
        long product = 1;
        long phi[] = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            phi[i] = i;
        }

        for (int p = 2; p <= n; p++) {

            if (phi[p] == p) {
                phi[p] = p - 1;

                for (int i = 2 * p; i <= n; i += p) {

                    // Add contribution of p to its
                    // multiple i by multiplying with
                    // (1 - 1/p)
                    phi[i] = (phi[i] / p) * (p - 1);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            sum = sum + phi[i];
            product = product * phi[i];
            System.out.println("Totient of " + i + " is " + phi[i]);
        }

        System.out.println("Sum of all values is : " + sum);
        System.out.println("Product of all values is : " + product);
        System.out.println("Difference of Product and sum of all values are : " + (product - sum));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of output : ");
        int n = sc.nextInt();
        EulerTotient obj = new EulerTotient();
        obj.computeTotient(n);
    }
}

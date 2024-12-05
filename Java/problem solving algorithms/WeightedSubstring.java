package com.anu.learning.pla;
import java.util.Scanner;

public class WeightedSubstring {

    // Function to calculate the weight of a character
    public static int getCharWeight(char c) {
        return c - 'a' + 1; // Weight of 'a' is 1, 'b' is 2, ..., 'z' is 26
    }

    // Function to find and print all substrings with weight less than or equal to k
    public static void findWeightedSubstrings(String str, int k) {
        int n = str.length();

        // Iterate through all possible substrings
        for (int start = 0; start < n; start++) {
            int currentWeight = 0;

            for (int end = start; end < n; end++) {
                currentWeight += getCharWeight(str.charAt(end));

                // If the current substring's weight is less than or equal to k, print it
                if (currentWeight <= k) {
                    System.out.println(str.substring(start, end + 1));
                } else {
                    break; // No need to continue if the weight exceeds k
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take string input from user
        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();

        // Take weight limit k input from user
        System.out.println("Enter the weight limit k:");
        int k = scanner.nextInt();

        System.out.println("All weighted substrings: \n");
        findWeightedSubstrings(inputString, k);
    }
}
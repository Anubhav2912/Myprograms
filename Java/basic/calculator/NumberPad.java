package com.anu.learning.basic.calculator;

import java.util.Scanner;

public class NumberPad {
    private int digitKey;

    public int press() {
        return new Scanner(System.in).nextInt();
    }


}

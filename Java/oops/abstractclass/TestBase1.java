package com.anu.learning.oops.abstractclass;

public class TestBase1 {
    public static void main(String[] args) {
        Base1 g = new Derived1();
        Base1 b = new Derived2();
        Base1 y = new Derived3();
        g.Color();
        b.Color();
        y.Color();
    }
}

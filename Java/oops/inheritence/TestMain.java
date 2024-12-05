package com.anu.learning.oops.inheritence;

public class TestMain {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        Base bd = new Derived();
        System.out.println(" Base " + b.c + " " + b.d);
        System.out.println("Derived " + d.c + " " + d.d);
        System.out.println("Base - Derived" + bd.c + " " + bd.d);
        b.display();
        b.show();
        d.display();
        d.show();
        bd.display();
        bd.show();

    }
}

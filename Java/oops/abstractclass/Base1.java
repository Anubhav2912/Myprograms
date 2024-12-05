package com.anu.learning.oops.abstractclass;

public abstract class Base1 {
    public abstract void Color();
}

class Derived1 extends Base1 {
    @Override
    public void Color() {
        System.out.println("Color is green");
    }
}

class Derived2 extends Base1 {
    @Override
    public void Color() {
        System.out.println("Color is blue");
    }
}

class Derived3 extends Base1 {
    @Override
    public void Color() {
        System.out.println("Color is Yellow");
    }
}
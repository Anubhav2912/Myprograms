package com.anu.learning.oops.DesignPattern.Decorator;

public abstract class BasePizza {
    public abstract int cost();
}

class Margherita extends BasePizza{

    @Override
    public int cost() {
        return 100;
    }
}

class VegPizza extends BasePizza{

    @Override
    public int cost() {
        return 140;
    }
}

class NonVegPizza extends BasePizza{

    @Override
    public int cost() {
        return 200;
    }
}
package com.anu.learning.oops.DesignPattern.Decorator;

public abstract class Toppings extends BasePizza{
    @Override
    public int cost() {
        return 0;
    }
}
class ExtraCheeze extends Toppings{
    BasePizza basePizza;
    public ExtraCheeze(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 40;
    }
}

class ExtraVeggie extends Toppings{
    BasePizza basePizza;
    public ExtraVeggie(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }
}

class Jalapeno extends Toppings{
    BasePizza basePizza;
    public Jalapeno(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}

class Olives extends Toppings{
    BasePizza basePizza;
    public Olives(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}

class PaneerCubes extends Toppings{
    BasePizza basePizza;
    public PaneerCubes(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 60;
    }
}

class ChickenCubes extends Toppings{
    BasePizza basePizza;
    public ChickenCubes(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 70;
    }
}
package com.anu.learning.oops.DesignPattern.Decorator;

import com.anu.learning.oops.DesignPattern.Decorator.constants.ToppingType;

public class ToppingsFactory {

    public static BasePizza getToppingsObject(BasePizza basePizza, ToppingType toppingType) {
        switch(toppingType) {
            case EXTRA_CHEEZE:
                return new ExtraCheeze(basePizza);
            case EXTRA_VEGGIE:
                return new ExtraVeggie(basePizza);
            case JALAPENO:
                return new Jalapeno(basePizza);
            case OLIVES:
                return new Olives(basePizza);
            case PANEER_CUBES:
                return new PaneerCubes(basePizza);
            case CHICKEN_CUBES:
                return new ChickenCubes(basePizza);
        }
        return basePizza;
    }
}

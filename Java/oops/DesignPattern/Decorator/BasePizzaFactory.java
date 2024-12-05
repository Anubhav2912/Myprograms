package com.anu.learning.oops.DesignPattern.Decorator;

import com.anu.learning.oops.DesignPattern.Decorator.constants.BasePizzaType;

public class BasePizzaFactory {

        public static BasePizza getBasePizzaObject(BasePizzaType pizzaType) {
            BasePizza basePizza = null;
            switch(pizzaType) {
                case MARGHERITA:
                    return new Margherita();
                case VEG_PIZZA:
                    return new VegPizza();
                case NON_VEG_PIZZA:
                    return new NonVegPizza();
                default:
                    return null;
            }
        }
    }
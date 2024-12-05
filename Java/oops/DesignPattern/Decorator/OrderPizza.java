package com.anu.learning.oops.DesignPattern.Decorator;

import com.anu.learning.oops.DesignPattern.Decorator.constants.AppConstants;
import com.anu.learning.oops.DesignPattern.Decorator.constants.BasePizzaType;
import com.anu.learning.oops.DesignPattern.Decorator.constants.ToppingType;

import java.util.Scanner;

public class OrderPizza {

    public static void main(String[] args) {

        BasePizza basePizza = null;
        Toppings toppings = null;
        Scanner sc= new Scanner(System.in);
        System.out.println(AppConstants.PIZZA_OPTIONS_MSG);
        Integer n = sc.nextInt();
        switch (n) {
            case 1:
                basePizza = BasePizzaFactory.getBasePizzaObject(BasePizzaType.MARGHERITA);
                break;

            case 2:
                basePizza = BasePizzaFactory.getBasePizzaObject(BasePizzaType.VEG_PIZZA);
                break;

            case 3:
                basePizza = BasePizzaFactory.getBasePizzaObject(BasePizzaType.NON_VEG_PIZZA);
                break;

            default:
                System.out.println(AppConstants.INVALID_INPUT);
        }

        System.out.println("Do you want to add toppings to your pizza?\n1 for Yes\n2 for No");
        n = sc.nextInt();
        if( n == 2){
            System.out.println(AppConstants.TOTAL_COST + basePizza.cost());
        } else if( n == 1){
            do {
                System.out.println(AppConstants.TOOPINGS_OPTIONS);
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        basePizza = ToppingsFactory.getToppingsObject(basePizza, ToppingType.EXTRA_CHEEZE);
                        break;
                    case 2:
                        basePizza = ToppingsFactory.getToppingsObject(basePizza, ToppingType.EXTRA_VEGGIE);
                        break;
                    case 3:
                        basePizza = ToppingsFactory.getToppingsObject(basePizza, ToppingType.JALAPENO);
                        break;
                    case 4:
                        basePizza = ToppingsFactory.getToppingsObject(basePizza, ToppingType.OLIVES);
                        break;
                    case 5:
                        basePizza = ToppingsFactory.getToppingsObject(basePizza, ToppingType.PANEER_CUBES);
                        break;
                    case 6:
                        basePizza = ToppingsFactory.getToppingsObject(basePizza, ToppingType.CHICKEN_CUBES);
                        break;
                    default:
                        System.out.println(AppConstants.INVALID_INPUT);
                }
                System.out.println("Do you want to add some extra toppings to your pizza?\n1 for Yes\n2 for No");
                n = sc.nextInt();

            } while (n!=2);
            System.out.println(AppConstants.TOTAL_COST + basePizza.cost());
        }

    }
}

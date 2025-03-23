package com.kulsin.beverage_decorator;

import com.kulsin.beverage_decorator.component.Beverage;
import com.kulsin.beverage_decorator.component.CupSize;
import com.kulsin.beverage_decorator.component.Decaf;
import com.kulsin.beverage_decorator.component.Espresso;
import com.kulsin.beverage_decorator.concrete_decorator.Mocha;
import com.kulsin.beverage_decorator.concrete_decorator.Soy;
import com.kulsin.beverage_decorator.concrete_decorator.Whip;

public class StarBuzzCoffeeApp {

    public static void main(String[] args) {

        Beverage beverage = new Espresso(CupSize.small); // Order an expresso, no condiments
        System.out.println("Order 1: " + beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Decaf(CupSize.large); // Order a decaf
        beverage2 = new Mocha(beverage2); // wrap it with a mocha
        beverage2 = new Mocha(beverage2); // wrap it in a second mocha
        beverage2 = new Whip(beverage2); // wrap it in a whip
        System.out.println("Order 2: " + beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new Espresso(CupSize.medium);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Mocha(beverage3);
        System.out.println("Order 3: " + beverage3.getDescription() + " $" + beverage3.cost());

    }

}

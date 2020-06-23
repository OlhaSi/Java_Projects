package controller;

import component.Pizza;
import component.PizzaImpl;
import decorator.BasilDecorator;
import decorator.CheeseDecorator;
import decorator.TomatoDecorator;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new PizzaImpl();
        System.out.println(pizza.getPrice());

        Pizza pizzaWithCheese = new CheeseDecorator(pizza);
        System.out.println(pizzaWithCheese.getPrice());

        Pizza pizzaWithTomato = new TomatoDecorator(pizza);
        System.out.println(pizzaWithTomato.getPrice());

        Pizza pizzaWithBasil = new BasilDecorator(pizza);
        System.out.println(pizzaWithBasil.getPrice());

        Pizza pizzaMargherita = new CheeseDecorator(new TomatoDecorator(new BasilDecorator(pizza)));
        System.out.println(pizzaMargherita.getPrice());
    }
}

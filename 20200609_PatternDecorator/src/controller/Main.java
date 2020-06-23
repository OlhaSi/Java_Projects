package controller;

import component.Coffee;
import component.CoffeeImpl;
import decorator.BrandyDecorator;
import decorator.MilkDecorator;
import decorator.SugarDecorator;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new CoffeeImpl();
        System.out.println(coffee.getPrice());

        Coffee coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println(coffeeWithMilk.getPrice());

        Coffee coffeeWithSugar = new SugarDecorator(coffee);
        System.out.println(coffeeWithSugar.getPrice());

        Coffee coffeeWithMilkAndSugar = new MilkDecorator(new SugarDecorator(coffee));
        System.out.println(coffeeWithMilkAndSugar.getPrice());

        Coffee lux = new BrandyDecorator(new MilkDecorator(new SugarDecorator(coffee)));
        System.out.println(lux.getPrice());

        Coffee lux1 = new BrandyDecorator(coffeeWithMilkAndSugar);
        System.out.println(lux1.getPrice());

        Coffee coffeeDeLux = new BrandyDecorator(new BrandyDecorator(coffee));
        System.out.println(coffeeDeLux.getPrice());
    }
}

package decorator;

import component.Pizza;

public class TomatoDecorator extends AbstractDecorator {
    private static final int TOMATO_PRICE = 15;

    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + TOMATO_PRICE;
    }
}

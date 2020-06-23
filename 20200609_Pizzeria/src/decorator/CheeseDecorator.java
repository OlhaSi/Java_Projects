package decorator;

import component.Pizza;

public class CheeseDecorator extends AbstractDecorator {
    private final static int CHEESE_PRICE = 10;

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + CHEESE_PRICE;
    }
}

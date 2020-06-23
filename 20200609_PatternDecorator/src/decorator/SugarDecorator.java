package decorator;

import component.Coffee;

public class SugarDecorator extends AbstractDecorator {
    private static final int SUGAR_PRICE = 5;

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + SUGAR_PRICE;
    }
}

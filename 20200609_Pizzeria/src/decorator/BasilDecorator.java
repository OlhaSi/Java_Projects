package decorator;

import component.Pizza;

public class BasilDecorator extends AbstractDecorator {
    private static final int BASIL_PRICE = 5;

    public BasilDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + BASIL_PRICE;
    }
}

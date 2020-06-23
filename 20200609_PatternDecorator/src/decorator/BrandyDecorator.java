package decorator;

import component.Coffee;

public class BrandyDecorator extends AbstractDecorator {
    private static final int BRANDY_PRICE = 20;

    public BrandyDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + BRANDY_PRICE;
    }
}

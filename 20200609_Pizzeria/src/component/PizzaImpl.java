package component;

public class PizzaImpl implements Pizza {

    private static final int BASIC_PIZZA_PRICE = 50;

    @Override
    public int getPrice() {
        return BASIC_PIZZA_PRICE;
    }
}

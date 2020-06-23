package component;

public class CoffeeImpl implements Coffee {

    private static final int BASIC_COFFEE_PRICE = 50;
    @Override
    public int getPrice() {
        return BASIC_COFFEE_PRICE;
    }
}

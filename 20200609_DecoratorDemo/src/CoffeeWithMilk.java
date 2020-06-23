public class CoffeeWithMilk extends Coffee {

    private final static int MILK_PRICE = 15;

    @Override
    public int getPrice() {
        return super.getPrice() + MILK_PRICE;
    }
}

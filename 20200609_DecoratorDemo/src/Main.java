public class Main {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Coffee withMilk = new CoffeeWithMilk();
        Coffee withSugar = new CoffeeWithSugar();

        System.out.println(coffee.getPrice());
        System.out.println(withMilk.getPrice() + withSugar.getPrice());
        System.out.println(withSugar.getPrice());
    }
}

package telran.data;

import telran.dao.Group;

public class Box extends Section{

    final double PRICE_FACTOR = 2.5;
    private double classHour = 1.5;

    public Box(String trainerName, DayOfWeek[] days, Group group) {
        super(trainerName, days, group);
    }

    @Override
    public double getPricePerHour() {
        return PRICE_FACTOR * BASIC_PRICE;
    }

    @Override
    public double getPricePerMonth() {
        return classHour * getPricePerHour() * getDays().length * 4;
    }
}

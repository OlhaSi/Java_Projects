package telran.data;

public class Flower extends Plant {

    private final static int FLOWER_GROWTH_PER_SEASON = 40;

    public Flower(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public int getGrowPerSeason() {
        return FLOWER_GROWTH_PER_SEASON;
    }

    @Override
    public void doSummer() {
        System.out.println(getName() + " doesn't grows up in summer, it blossoms ");
    }

    @Override
    public void doAutumn() {
        setHeight(2);
        System.out.println(getName() + " is cut to 2 sm in autumn " + getHeight());
    }
}

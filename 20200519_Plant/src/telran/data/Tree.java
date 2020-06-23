package telran.data;

public class Tree extends Plant {

    private final static int TREE_GROWTH_PER_SEASON = 50;

    public Tree(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public int getGrowPerSeason() {
        return TREE_GROWTH_PER_SEASON;
    }

    @Override
    public void doSummer() {
        setHeight(getHeight() + TREE_GROWTH_PER_SEASON);
        System.out.println(getName() + " has grown up in summer " + getHeight());
    }

    @Override
    public void doAutumn() {
        setHeight(getHeight() + TREE_GROWTH_PER_SEASON);
        System.out.println(getName() + " has grown in autumn " + getHeight());
    }
}

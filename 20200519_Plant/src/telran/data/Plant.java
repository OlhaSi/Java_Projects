package telran.data;

public abstract class Plant {

    private String name;
    private int height;
    private int age;

    public Plant(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addYearToAge(){
        this.age++;
    }

    public abstract int getGrowPerSeason();

    public void doYear(){
        doSpring();
        doSummer();
        doAutumn();
        doWinter();
    }

    public void doWinter(){
        System.out.println(getName() + " is not growing up in winter " + getHeight());
    }

    public void doSpring(){
       addYearToAge();
        System.out.println(getName() + " at the beginning of season the height is: " + getHeight());
        setHeight(getHeight() + getGrowPerSeason());
        System.out.println(getName() + " has grown up to: " + getHeight());
    }

    protected abstract void doSummer();
    protected abstract void doAutumn();

    @Override
    public String toString() {
        return "Plant: " + name +
                ", height: " + height +
                ", age: " + age;
    }
}

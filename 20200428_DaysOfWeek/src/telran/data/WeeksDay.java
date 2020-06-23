package telran.data;

public enum WeeksDay {

    MONDAY (1),
    TUESDAY (2),
    WEDNESDAY (3),
    THURSDAY (4),
    FRIDAY (5),
    SATURDAY (6),
    SUNDAY (7);

    private int numberOfDay;

    WeeksDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public static void getDayByNumber(int num){
        for (int i = 0; i < WeeksDay.values().length; i++) {
            if(WeeksDay.values()[i].getNumberOfDay() == num){
                System.out.println(WeeksDay.values()[i]);
            }
        }
    }

    public static void getDayByOrderly(int num){
        WeeksDay[] weekDays = WeeksDay.values();
        for (int i = 0; i < weekDays.length; i++) {
            if(i + 1 == num){
                System.out.println(weekDays[i].name().toLowerCase());
            }
        }
    }
}

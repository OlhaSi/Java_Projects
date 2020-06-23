package telran.data;

public class Schedule {
    private WeeksDay weeksDay;

    public Schedule(WeeksDay weeksDay) {
        this.weeksDay = weeksDay;
    }

    public WeeksDay getWeeksDay() {
        return weeksDay;
    }

    public void setWeeksDay(WeeksDay weeksDay) {
        this.weeksDay = weeksDay;
    }

    public void wakeUp(){
        if(getWeeksDay() == WeeksDay.SUNDAY || getWeeksDay() == WeeksDay.SATURDAY){
            System.out.println("you can sleep longer");
        }else{
            System.out.println("wake up!");
        }
    }

    public void getMenu(){
        switch (weeksDay){
            case MONDAY:
                System.out.println("Spaghetti");
                break;
            case TUESDAY:
                System.out.println("Chicken");
                break;
            case WEDNESDAY:
                System.out.println("Pizza");
                break;
            case THURSDAY:
                System.out.println("Fish");
                break;
            case FRIDAY:
                System.out.println("Burger");
                break;
            case SATURDAY:
                System.out.println("Pasta");
                break;
            case SUNDAY:
                System.out.println("Veggi Bowl");
                break;
        }
    }
}

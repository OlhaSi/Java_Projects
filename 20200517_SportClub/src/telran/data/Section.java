package telran.data;

import telran.dao.Group;

import java.util.Arrays;

public abstract class Section {

    final double BASIC_PRICE = 9.5;
    private String trainerName;
    private DayOfWeek[] days;
    private Group group;

    public Section(String trainerName, DayOfWeek[] days, Group group) {
        this.trainerName = trainerName;
        this.days = days;
        this.group = group;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public DayOfWeek[] getDays() {
        return days;
    }

    public void setDays(DayOfWeek[] days) {
        this.days = days;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName().toUpperCase() + " section" +"\n"+
                "Name of Trainer: " + trainerName;
//                ", days: " + Arrays.toString(days) +
//                ", group: " + group;
    }

    public abstract double getPricePerHour();

    public abstract double getPricePerMonth();
}

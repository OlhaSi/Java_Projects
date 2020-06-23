package telran.data;

import javax.swing.*;

public enum DayOfWeek {

    MONDAY ("mon"),
    TUESDAY ("tue"),
    WEDNESDAY ("wed"),
    THURSDAY ("thu"),
    FRIDAY ("fri"),
    SATURDAY ("sat"),
    SUNDAY ("sun");

    DayOfWeek(String mon){
        this.name = mon;
    }

    private String name;

    public static void displayDayOfWeek(DayOfWeek[] days){
        for (int i = 0; i < days.length-1; i++) {
            System.out.print(days[i].name + ", ");
        }
        System.out.print(days[days.length-1].name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

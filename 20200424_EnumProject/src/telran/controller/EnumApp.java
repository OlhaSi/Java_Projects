package telran.controller;

import telran.data.DayOfWeek;
import telran.data.Schedule;
import telran.data.WeeksDay;

import java.util.Arrays;

public class EnumApp {

    public static void main(String[] args) {

       DayOfWeek monday = DayOfWeek.MONDAY;

        Schedule schedule = new Schedule(WeeksDay.SATURDAY);
        schedule.wakeUp();
        Schedule schedule1 = new Schedule(WeeksDay.FRIDAY);
        schedule1.wakeUp();
        schedule.getMenu();
        schedule1.getMenu();

        System.out.println(WeeksDay.SATURDAY);
        System.out.println(Arrays.toString(WeeksDay.values()));
        System.out.println(WeeksDay.FRIDAY.ordinal());
        WeeksDay.FRIDAY.printHello();
    }

}

public class DateValidator {

    public static boolean dateValidator(int day, int month, int year){
        return isYearCorrect(year) &&
                isMonthCorrect(month) &&
                isDayCorrect(day, month, year);
    }

    private static boolean isYearCorrect(int year){
        return year >= 1;
    }

    private static boolean isMonthCorrect(int month){
        return month >= 1 && month <= 12;
    }

    private static boolean isDayCorrect(int day, int month, int year){
        if(day >= 1 && day <= 28)
            return true;
        return day > 28 && day <= getDayInMonth(month, year);
    }

    private static boolean isYearLeap(int year){
        return (year % 400 == 0 || year % 4 == 0) && (year % 100 != 0);
    }

    private static int getDayInMonth(int month, int year){
        if(month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2){
            return 28 + addDayIfYearLeap(year);
        }
        return 31;
    }

    private static int addDayIfYearLeap(int year){
        return isYearLeap(year) ? 1 : 0;
    }

}

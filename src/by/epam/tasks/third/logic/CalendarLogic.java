package by.epam.tasks.third.logic;

import by.epam.tasks.third.bean.Calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class CalendarLogic {

    public void addWeekend(Calendar calendar){
        LocalDate date = LocalDate.of(calendar.getYear(), 1, 1);
        while (date.getDayOfWeek() != DayOfWeek.SATURDAY
                && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
            date = date.plusDays(1);
        }
        new HolidayLogic().addWeekend(calendar.getHolidays(), date, calendar.getYear());
    }

    public void addHoliday(Calendar calendar, Calendar.Holiday holiday){
        new HolidayLogic().addHoliday(calendar.getHolidays(), holiday);
    }

    public void deleteHoliday(Calendar calendar, String nameOfHoliday){
        new HolidayLogic().deleteHoliday(calendar.getHolidays(), nameOfHoliday);
    }

    public void printHoliday(Calendar calendar){
        new HolidayLogic().printHoliday(calendar.getHolidays());
    }

    public static class HolidayLogic {

        public void addHoliday(ArrayList<Calendar.Holiday> holidays, Calendar.Holiday holiday) {
            holidays.add(holiday);
        }

        public void deleteHoliday(ArrayList<Calendar.Holiday> holidays, String nameOfHoliday) {
            holidays.removeIf(holiday -> holiday.getNameOfHoliday().equals(nameOfHoliday));
        }

        public void printHoliday(ArrayList<Calendar.Holiday> holidays) {
            for (Calendar.Holiday holiday: holidays)
                System.out.println(holiday);
            System.out.println();
        }

        public void addWeekend(ArrayList<Calendar.Holiday> holidays, LocalDate date, int year) {
            while (date.getYear() == year) {
                if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                    holidays.add(new Calendar.Holiday("Saturday", date));
                    date = date.plusDays(1);
                } else if(date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    holidays.add(new Calendar.Holiday("Sunday", date));
                    date = date.plusDays(6);
                } else { date = date.plusDays(1); }
            }
        }
    }
}

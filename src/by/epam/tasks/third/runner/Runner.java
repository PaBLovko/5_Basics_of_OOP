package by.epam.tasks.third.runner;

/*
    Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
    выходных и праздничных днях.
 */

import by.epam.tasks.third.bean.Calendar;
import by.epam.tasks.third.logic.CalendarLogic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int year = 2021;
        CalendarLogic calendarLogic = new CalendarLogic();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        Calendar.Holiday holidayOrthodoxChristmas = new Calendar.Holiday(
                "Orthodox Christmas", LocalDate.parse("07.01." + year, dateTimeFormatter));
        Calendar.Holiday holidayWomenDay = new Calendar.Holiday(
                "Women’s Day", LocalDate.parse("08.03." + year, dateTimeFormatter));
        Calendar.Holiday holidayLabourDay = new Calendar.Holiday(
                "Labour Day", LocalDate.parse("01.05." + year, dateTimeFormatter));
        Calendar.Holiday holidayVictoryDay = new Calendar.Holiday(
                "Victory Day", LocalDate.parse("09.05." + year, dateTimeFormatter));
        ArrayList<Calendar.Holiday> holidays = new ArrayList<>(Arrays.asList(
                holidayOrthodoxChristmas, holidayWomenDay, holidayLabourDay, holidayVictoryDay));
        Calendar calendar = new Calendar(year, holidays);
        calendarLogic.printHoliday(calendar);
        Calendar.Holiday holidayNewYear = new Calendar.Holiday(
                "New Year", LocalDate.parse("01.01." + year, dateTimeFormatter));
        calendarLogic.addHoliday(calendar, holidayNewYear);
        calendarLogic.printHoliday(calendar);
        calendarLogic.deleteHoliday(calendar, "New Year");
        calendarLogic.printHoliday(calendar);
        calendarLogic.addWeekend(calendar);
        calendarLogic.printHoliday(calendar);
    }
}
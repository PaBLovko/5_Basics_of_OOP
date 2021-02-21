package by.epam.tasks.third.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Calendar {
    private int year;
    private ArrayList<Holiday> holidays;

    public Calendar(int year, ArrayList<Holiday> holidays) {
        this.year = year;
        this.holidays = holidays;
    }

    public Calendar(int year) {
        this.year = year;
        this.holidays = new ArrayList<>();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(ArrayList<Holiday> holidays) {
        this.holidays = holidays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return year == calendar.year &&
                Objects.equals(holidays, calendar.holidays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, holidays);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "year=" + year +
                ", holidays=" + holidays +
                '}';
    }

    public static class Holiday{
        private String nameOfHoliday;
        private LocalDate holidayDate;

        public Holiday(String nameOfHoliday, LocalDate holidayDate) {
            this.nameOfHoliday = nameOfHoliday;
            this.holidayDate = holidayDate;
        }

        public String getNameOfHoliday() {
            return nameOfHoliday;
        }

        public void setNameOfHoliday(String nameOfHoliday) {
            this.nameOfHoliday = nameOfHoliday;
        }

        public LocalDate getHolidayDate() {
            return holidayDate;
        }

        public void setHolidayDate(LocalDate holidayDate) {
            this.holidayDate = holidayDate;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Holiday holiday = (Holiday) o;
            return Objects.equals(nameOfHoliday, holiday.nameOfHoliday) &&
                    Objects.equals(holidayDate, holiday.holidayDate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nameOfHoliday, holidayDate);
        }

        @Override
        public String toString() {
            return "Holiday{" +
                    "nameOfHoliday='" + nameOfHoliday + '\'' +
                    ", holidayDate=" + holidayDate +
                    '}';
        }
    }
}

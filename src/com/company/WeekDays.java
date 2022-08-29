package com.company;

public enum WeekDays {
    SUNDAY ("Жекшемби"),
    MONDAY ("Дуйшомбу"),
    TUESDAY ("Шейшемби"),
    WEDNESDAY ("Шаршемби"),
    THURSDAY ("Бейшемби"),
    FRIDAY ("Жума"),
    SATURDAY ("Ишемби");

    private String day;

    private WeekDays(String day){
        this.day = day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return day;
    }
}

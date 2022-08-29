package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next().toUpperCase();
        WeekDays weekDays = WeekDays.valueOf(day);
        peaksoftDays(weekDays);
    }

    public static void peaksoftDays(WeekDays weekDays){
            switch (weekDays) {
                case MONDAY -> System.out.println(WeekDays.MONDAY.getDay() + " куну теорияык сабак бар");
                case TUESDAY -> System.out.println(WeekDays.TUESDAY.getDay() + " куну session бар жана Talking for beginners болот");
                case WEDNESDAY -> System.out.println(WeekDays.valueOf("WEDNESDAY") + " куну теорияык сабак бар жана Advanced talking club  болот");
                case THURSDAY -> System.out.println(WeekDays.valueOf("THURSDAY") + " куну session болот");
                case FRIDAY -> System.out.println(WeekDays.valueOf("FRIDAY") + " куну Event болот жана кечиндеси теорияык сабак бар");
                case SATURDAY -> System.out.println(WeekDays.valueOf("SATURDAY") + " куну Peaksoft ко келип теннис ойносон болот");
                case SUNDAY -> System.out.println(WeekDays.valueOf("SUNDAY") + " куну  Peaksoft иштебейт");
                default -> System.out.println("Кунду туура эмес киргиздиниз");
            }
    }
}

package com.adv.enums;

import java.util.Scanner;

public  class WeekDaysInEnum {

    public static void main(String[] args) {
        System.out.println("Please enter days in number");
        int input = new Scanner(System.in).nextInt();
        for (WeekDays weekDays : WeekDays.values()) {
            if (weekDays.dayInNumber == input) {
                System.out.println(weekDays);
            }
        }

    }

}
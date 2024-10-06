package com.adv.enums;

public enum WeekDays {
    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    OTHERDAY(7)
    ;
    WeekDays(int dayInNumber){
        this.dayInNumber=dayInNumber;
    }
    final int dayInNumber;
    public static void main(String[] args) {
     for (WeekDays weekDays:WeekDays.values()){
         System.out.println(weekDays);
     }
     System.out.println(WeekDays.valueOf("SUNDAY").dayInNumber);

    }

}

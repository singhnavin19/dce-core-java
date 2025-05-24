package basic.advJava;

import java.util.Scanner;

public enum WeekDays {
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday");

    String nameInLowerCases;

    WeekDays(String nameInLowerCases){
        this.nameInLowerCases=nameInLowerCases;
    }

    public static void main(String[] args) {
        System.out.println(WeekDays.MONDAY.nameInLowerCases);
//        System.out.println("please enter days name of week");
//        String input=new Scanner(System.in).nextLine();
//        System.out.println(WeekDays.SUNDAY.name().equals(input));
//        System.out.println(WeekDays.TUESDAY.ordinal());

        for(WeekDays weekDays:WeekDays.values()){
            System.out.println(weekDays +" in lower :- " +weekDays.nameInLowerCases);
        }
    }
}

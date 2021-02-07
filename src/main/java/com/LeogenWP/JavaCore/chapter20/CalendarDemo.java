package com.LeogenWP.JavaCore.chapter20;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        String months[] = {
                "Jan" , "Feb" , "Mar" , "Apr" ,
                "Мау", "Jun", "Jul","Aug",
                "Sep" , "Oct" , "Nov", "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        System.out.print("Date: ");
        System.out.print(months[calendar.get(Calendar.MONTH)]);
        System.out.print(" " + calendar.get(Calendar.DATE) + " ");
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(calendar.get(Calendar.HOUR ) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.println(calendar.get(Calendar.SECOND));
    }
}

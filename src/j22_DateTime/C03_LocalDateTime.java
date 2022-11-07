package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_LocalDateTime {
    public static void main(String[] args) {
       // LocalDateTime tarih ve zaman bilgilerini tutr.
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("ldt = " + ldt);
        LocalDate d=LocalDate.of(2016,3,13);
        LocalTime t=LocalTime.of(14,45,35);

        LocalDateTime trhZmn=LocalDateTime.of(d,t);
        System.out.println("trhZmn = " + trhZmn);
       LocalDateTime ltd1=LocalDateTime.of (2018, Month.MAY,19,20,30);
        System.out.println("ltd1 = " + ltd1);
        System.out.println("trhZmn = " + trhZmn);
        System.out.println("trhZmn.getDayOfMonth() = " + trhZmn.getDayOfMonth());
        System.out.println("trhZmn.getDayOfWeek() = " + trhZmn.getDayOfWeek());
        System.out.println("trhZmn.getHour() = " + trhZmn.getHour());
        System.out.println("trhZmn.plusWeeks(3).minusDays(5).plusHours(13) = " + trhZmn.plusWeeks(3).minusDays(5).plusHours(13));

    }
}

package d12;

import java.time.LocalDate;

public class Q01_LocalDate {
    public static void main(String[] args) {
        // Bugunun tarihi aliniz, yazdiriniz...
// Daha Sonra 1 gun, 1 Ay ve 1 yil ekleyerek degisen tarihi yazdiriniz..
// Degisen tarih uzerinden 3 gun, 2 ay ve 5 yil eksilterek son tarihi yaziniz..

        LocalDate toDay=LocalDate.now();
        System.out.println(toDay);
        LocalDate newdate=toDay.plusDays(1).plusMonths(1).plusYears(1);

        System.out.println("newdate = " + newdate);
LocalDate lastDate=newdate.minusDays(3).minusMonths(5).minusYears(1);

        System.out.println("lastDate = " + lastDate);
    }




    }




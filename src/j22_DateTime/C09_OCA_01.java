package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class C09_OCA_01 {
    public static void main(String[] args) {
        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
//what is the result ?

        /*
         * A) May 04, 2014T00:00:00:000
         *
         * B) 2014-05-04T00:00:00:000
         *
         * C) 5/4/14T00:00:00:000
         *
         * D) An exception is throw at runtime
         */

// cevap d sıkkı cunkü local de time vermeyip sonuçta time istemis 8 . satırdaki TIME yazısını silersek bize tarihi yzdırır.
        LocalDate dt1=LocalDate.of(2014,6,21);
                LocalDate dt2=LocalDate.of(2014, Month.JUNE,21);
        System.out.println("dt1 = " + dt1);
        System.out.println("dt2 = " + dt2);
    }
}

package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        // period-> iki tarih arasında  gecen tekraralanabilen zamanı tutar...
        LocalDate bugün=LocalDate.now();
        LocalDate fathBirthDay=LocalDate.of(1993,5,19);
        Period fark=Period.between(fathBirthDay,bugün);
        System.out.println("fark = " + fark);
        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());// 353 aylık
        System.out.println("fark.getDays() = " + fark.getDays());// fark datasının gun degeri

        System.out.println("  ****   ");
        System.out.println("bugün = " + bugün);

        Period period5Gun=Period.ofDays(5);// 5gunde bir tekrarlı period
        Period period7ay=Period.ofMonths(7);// 7 ayda bir tekrarlı period
        Period periodX=Period.ofMonths(7).ofDays(21);
        bugün=bugün.plus(period5Gun);
        System.out.println("bugün = " + bugün);
        bugün=bugün.minus(period7ay);
        System.out.println("bugün = " + bugün);
        bugün=bugün.plus(periodX);
        System.out.println("bugün = " + bugün);
// TRİCK periodladar coklu tanımlamada sondaki  zaman parametresi gecerli olur digerleri ezilir

        // Tsk-> 05.09.2022 de başlayan kur 9 ay olduguna göre bitiş tarihini print et.
        LocalDate baslangıc=LocalDate.of(2022,9,5);
        System.out.println("baslangıc = " + baslangıc);

        Period bitis=Period.ofMonths(9);// kurs suresi 9 ay olaak atandı
        System.out.println("baslangıc.plus(bitis) = " + baslangıc.plus(bitis));

        System.out.println(" kurs bitiş tarihi = " + baslangıc.plus(bitis).format(DateTimeFormatter.ISO_DATE));
// ISO -> International Oragnization for Standartization
    }
}

package j22_DateTime;

import java.time.LocalDate;

public class C07_CompareingDateTime {
    public static void main(String[] args) {
        LocalDate bugün=LocalDate.now();
        LocalDate falanGun=bugün.minusDays(2);
        LocalDate filanGun=bugün.plusDays(3);


        System.out.println("bugün = " + bugün);
        System.out.println("falanGun = " + falanGun);
        System.out.println("filanGun = " + filanGun);

        System.out.println("bugün.isBefore(falanGun) = " + bugün.isBefore(falanGun));
        System.out.println("bugün.isBefore(filanGun) = " + bugün.isBefore(filanGun));
        System.out.println("falanGun.isBefore(filanGun) = " + falanGun.isBefore(filanGun));


        // is ile başlayan metodlar boolean return ederr.
        System.out.println("bugün.isAfter(falanGun) = " + bugün.isAfter(falanGun));
        System.out.println("falanGun.isAfter(filanGun) = " + falanGun.isAfter(filanGun));
        LocalDate fathBirthDay=LocalDate.of(1993,5,19);

        System.out.println("bugün.isLeapYear() = " + bugün.isLeapYear());// leap year artık yıl
       int fark=bugün.compareTo(falanGun);
        System.out.println("fark = " + fark);
       int fark2=falanGun.compareTo(filanGun);
        System.out.println("fark2 = " + fark2);
        System.out.println("bugün.compareTo(fathBirthDay) = " + bugün.compareTo(fathBirthDay));
/*     ComperaTo komutu işlevi:
2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */


    }
}

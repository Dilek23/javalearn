package j22_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime suAn=LocalTime.now();//sistemden anlık zaman bilgisi atar.Local timwe saat dakika saniye tutar.
        System.out.println(suAn);
        System.out.println("suAn.getHour() = " + suAn.getHour());
        System.out.println("suAn.getMinute() = " + suAn.getMinute());
        System.out.println("suAn.getNano() = " + suAn.getNano());
        System.out.println("suAn.getSecond() = " + suAn.getSecond());
        // belirli zamandan ileri geri zamana gidilebilir
        LocalTime time1=LocalTime.of(13,43,34);
        System.out.println("time1.plusMinutes(90) = " + time1.plusMinutes(90));
        System.out.println("time1.plusMinutes(150) = " + time1.plusMinutes(150));
        System.out.println("time1.minusHours(23) = " + time1.minusHours(23));
        System.out.println("time1.minusMinutes(100).plusHours(2) = " + time1.minusMinutes(100).plusHours(2));
LocalTime forBası=LocalTime.now();
        System.out.println("forBası = " + forBası);
        int sayi=0;
        for (int i = 0; i < 100000; i++) {
         sayi+=i;

        }
        LocalTime forSonu=LocalTime.now();
        System.out.println("forSonu = " + forSonu);
        System.out.println(forSonu.getNano() - forBası.getNano());
    }
}

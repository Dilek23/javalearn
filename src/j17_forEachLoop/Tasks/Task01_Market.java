package j17_forEachLoop.Tasks;

import java.awt.geom.RoundRectangle2D;
import java.nio.file.Watchable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task01_Market {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */
   static ArrayList<String>days=new ArrayList<String>(List.of("Pazartesi","Salı","Carsamba","PErşembe","Cuma","Cumartesi","Pazar"));
   static ArrayList<Integer>gunlukKazanc=new ArrayList<Integer>();
    static double ortalama=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int gun=0;
        while (gun<days.size()) {
            System.out.print(days.get(gun)+" günü için gunluk kacancınızı giriniz: ");
            gunlukKazanc.add(sc.nextInt() );
            gun++;
        }

        System.out.println("Haftalık ortalama kazancınız="+getOrtalamaKazanc( gunlukKazanc));
        System.out.println(getOrtalamaninUstundeKazancGünleri());
        System.out.println(getOrtalamaninAltindaKazancGünleri());

        System.out.println("Bol KAzançlarrr...:)");
    }//main sonu

    private static List getOrtalamaninAltindaKazancGünleri() {
        ArrayList<String>ortalamaAltignler=new ArrayList<String>();
        for (int i = 0; i <gunlukKazanc.size() ; i++) {
           if (gunlukKazanc.get(i)<ortalama){
               ortalamaAltignler.add(days.get(i));
           }

        }
        System.out.println("***  Ortalamanın altında kazandıgınız gunler  ***");
        return ortalamaAltignler;
    }

    private static List getOrtalamaninUstundeKazancGünleri() {
        ArrayList<String>ortalamaUstgnler=new ArrayList<String>();
        for (int i = 0; i <gunlukKazanc.size() ; i++) {
            if (gunlukKazanc.get(i)>ortalama){
             ortalamaUstgnler.add(days.get(i));
            }

        }

        System.out.println("Ortalamanın üstünde kazandıgnız gunler:");
        return ortalamaUstgnler;
    }

    private static double getOrtalamaKazanc(ArrayList<Integer> gunlukKazanc) {
        double toplam=0;
        for (int i = 0; i < gunlukKazanc.size() ; i++) {
            toplam+= gunlukKazanc.get(i);
           ortalama=toplam/ days.size();

        }
        return ortalama;

    }

}


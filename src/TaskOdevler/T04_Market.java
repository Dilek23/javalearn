package TaskOdevler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T04_Market {

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
        static ArrayList<String> gunler = new ArrayList<String>(List.of("pazartesi ", "salı ", "çarşamba ", "perşembe ", "cuma ", "cumartesi ", "pazar "));
    static ArrayList<Integer> gunlukKazanc = new ArrayList<>();
    static double ort=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gun=0;
        while (gun<gunler.size()){
            System.out.print("Lütfen "+gunler.get(gun)+"  gunu sonunda kazıcınızı giriniz: ");
            gunlukKazanc.add(sc.nextInt());
            gun++;
        }
        System.out.println("gunlere gore kazancınız"+gunlukKazanc);

        System.out.println("haftalık ortalama kazancınız= "+getOrtalamaKazanc(gunlukKazanc));
        System.out.println(getOrtlamninUstundeKzncGünleri());

        System.out.println(getOrtlmaninAltindaKzncGünleri());
        System.out.println("Bol KAzançlarrr...:)");

    }

    private static List getOrtlmaninAltindaKzncGünleri() {
        ArrayList<String>ortAlti=new ArrayList<>();
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i) < ort) {
                ortAlti.add(gunler.get(i));


            }
        }
        System.out.println("  ***Ortalamanın altında kalan gunler*** ");
       return ortAlti;
    }

    private static List getOrtlamninUstundeKzncGünleri() {
        ArrayList<String>ortUstu=new ArrayList<>();
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if(gunlukKazanc.get(i)>ort){
                ortUstu.add(gunler.get(i));
            }

        }
        System.out.println("  ***Ortalamanın ustunde kalan gunler***  ");
        return ortUstu;

    }

    private static double getOrtalamaKazanc(ArrayList<Integer> gunlukKazanc) {
        int toplam=0;
        for (int i = 0; i <gunlukKazanc.size(); i++) {
           toplam+= gunlukKazanc.get(i);
           ort=toplam/gunlukKazanc.size();
        }
       return ort;
    }
}


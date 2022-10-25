package j20_PassByValeue;

public class C05_PassByValue {
    public static void main(String[] args) {
        /*
        eger bir metodda yapılan degisiiiiklik kalıcı olsun şstenirs 2.degisik yapılan

         */
        double etiketFiyatı=100;//primitive

        double indirimOranı=0.1;//primitive

        System.out.println("indirim öncesi"+etiketFiyatı);
        etiketFiyatı=indirim(etiketFiyatı,indirimOranı);

        System.out.println("indirim sonrası etiket fiyatı="+etiketFiyatı);
    }
    public static double indirim (double fiyat,double oran){
      fiyat*=(1-oran);
        System.out.println(" indirimli fiyat = " + fiyat);
        return fiyat;
    }

}

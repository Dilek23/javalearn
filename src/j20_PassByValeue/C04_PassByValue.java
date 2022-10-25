package j20_PassByValeue;

public class C04_PassByValue {
    static double etiketFiyatı;//güneş
    static double indirimOranı;//gunes
    public static void main(String[] args) {
        /*
        eger bir metoddda yapılan degşikilk kalıcı olsun istenirse
        1. yol degişiklik yapılan variablellar static olarak tanımlanır.

         */
        etiketFiyatı=100;
        System.out.println("indirim öncesi = " + etiketFiyatı);
        indirimOranı=0.11;
        indir();
        indirimOranı=0.22;
        indir();
        indirimOranı=0.05;
        indir();
        System.out.println("indirim sonrası"+etiketFiyatı);
    }
     public static void indir(){
        etiketFiyatı*=(1-indirimOranı);
         System.out.println("etiketFiyatı = " + etiketFiyatı);

     }
}

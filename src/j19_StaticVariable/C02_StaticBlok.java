package j19_StaticVariable;

public class C02_StaticBlok {
    static String isim;
     /*
     1.static blok yapıları static variableları deger ataması update için kullanılır.
     2. static blok yapıları oluşturulurken butun metodlardan main dahil önce calısır.
      3.birden fazla static blok varsa yukarıdan asagıya sıralama ile calışır.
      */
static {
         System.out.println("ilk blok calıştı");
         isim="Ugur";
         System.out.println("isim = " + isim);
     }




static {
         System.out.println("ikinci static blok calıstı.");
         isim="Dilek";
    System.out.println("isim = " + isim);
     }
    public static void main(String[] args) {

        System.out.println("main method başladı :) ");
        isim = "Kerim Bey";
        System.out.println("isim = " + isim);
        System.out.println("main method bitti :( ");//Kerim Bey
    }// main sonu





}

package j08_ifStatment_TernaryOperatör;

public class C01_ifStatement {
    public static void main(String[] args) {
        int krmYas = 45 ;
        int ismYas = 63;
        if (krmYas == ismYas) {
            System.out.println("aynı yasdasınız güzel insanlar");
            System.out.println("yoksa siz ikiz misiniz?");
        }
        if (krmYas >= 40) {
            System.out.println("krkm bey olgunluk yasındasımız");
          // if blokda {} kullanılmazsa ; kadar komut çalışır yada çalışmaz.
            System.out.println("bu yazıyı okuduysanız 12. satırdaki if den bağımsız");
        }
        if (krmYas + ismYas > 100) {
            System.out.println("kerm bey ve ism bey yas toplamı 100 den büyük");

        }
        System.out.println("selam javacanlar");
        /* Bagımsız if statement yapıları sadece kendi kapmsamlrını run eder.
        biden fazla bagımsız if statement yapıları hepsinin body calışabilceği gibi hiç birisini çlışmayabilir

         */
    }
}

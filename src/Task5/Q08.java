package Task5;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("alinan urun adedi: ");
        int urun = sc.nextInt();
        System.out.println("urun liste fiyati: ");
        int liste = sc.nextInt();
        System.out.println("Musteri karti varsa K ya basiniz yoksa Y ye basiniz:");
        char kart = sc.next().toLowerCase().charAt(0);
/*
        if (kart == 'k' && urun > 10) {
            System.out.println("%20 indirim kazandiniz odeyeceginiz miktar: " + (liste - (liste * 20) / 100));
            if (kart == 'y' && urun > 10) {
                System.out.println("%15 indirim kazandiniz odeyeceginiz miktar: " + (liste - (liste * 15) / 100));
            }
        } else if (kart == 'y' && urun > 10) {
            System.out.println("%15 indirim kazandiniz odeyeceginiz miktar: " + (liste - (liste * 15) / 100));
        } else if (kart == 'y' && urun < 10) {
            System.out.println("%10 indirim kazandiniz odeyeceginiz miktar: " + (liste - (liste * 10) / 100));
            */
        int odeme = liste - (liste * 20) / 100;
        int odeme2 = liste - (liste * 15) / 100;
        int odeme3 = liste - (liste * 10) / 100;
        System.out.println((kart == 'k' && urun > 10) ? "%20 indirim ile odeyecegiinz tutar:" + odeme : (kart == 'y' && urun > 10) ? "%15 ile ödeyecegınız tutar:" + odeme2 : (kart == 'y' && urun < 10) ? "Odeyeceginiz tutar:" + odeme3 : "yanlış bilgi girdiiniz");
    }
}






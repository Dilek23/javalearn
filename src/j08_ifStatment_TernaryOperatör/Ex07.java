package j08_ifStatment_TernaryOperatör;

import java.util.Scanner;
/*
        TASK -> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
        Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
        aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz


       */
public class Ex07 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ehliyetiniz var ise 'E' yoksa H gir");
        char ehlyt=sc.next().toUpperCase().charAt(0);// kullanıcıdan aldığı karakteri büyük harfe cevirir(touppercase)
        if(ehlyt=='E'){
            System.out.println("kaç yıllık tecrübeniz var");
            int tcrb= sc.nextInt();
            if(tcrb>=7){
                System.out.println("yaptığınız km giriniz");
                int km= sc.nextInt();
                if(km>=100000){
                    System.out.println("kontak anahtarı sizin");
                }else System.out.println("anahtar almak için önce:\t"+(100000-km)+"\tyola ihtiyacın var");

            }else System.out.println(" kontak olmaz:\t "+(7-tcrb)+"yıla ihtiyacın var");
        }else
            if(ehlyt =='H'){
                System.out.println("önce ehliyet al");
            }else
                System.out.println("Yanlış karakter girdiniz");

        }

}

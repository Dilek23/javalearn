package d01;

import java.util.Scanner;

public class Q09_Scanner {
    public static void main(String[] args) {
        //  Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin (pi =3.14)
//  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
//  Isim – soyisim : Elly Dainty
//  Kullanicidan ismini alip isminin bas harfini yazdirin.
        Scanner sc=new Scanner(System.in);
      //  System.out.println("Lütfen yarıcap değerini giriniz:");
        //int yarcp= sc.nextInt();

        //System.out.println("cevre = " + (2*3.14*yarcp));
        //System.out.println("Alan = " + (3.14*yarcp*yarcp));
       // System.out.println("isiminizi girniz:");
        //String isim= sc.nextLine();
       // System.out.println("soyisminizi girin");
        //String soyisim= sc.nextLine();
        //System.out.println(" isim-soyisim : " +isim+" "+ soyisim);
        System.out.println("isminizi giriniz:");
        char ilkHarf = sc.next().charAt(0);
        System.out.println("girdiginiz ismin ilk harfi : " + ilkHarf);

    }
}

package TaskOdevler;

import java.util.Scanner;

public class T01_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Topun atıldıgı yüksekligi giriniz:");
        double yksek=sc.nextDouble();
       double aldigiyol=0;
        int sekmesysi=0;
       do{
           sekmesysi++;
           aldigiyol+=yksek;
           yksek*=(double)3/4;
       }while (yksek>=1);
            System.out.println("sekme sayısı:"+sekmesysi);
            System.out.println("toplam alınan mesafe="+aldigiyol);
        }
    }


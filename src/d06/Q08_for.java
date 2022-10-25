package d06;

import java.util.Scanner;

public class Q08_for {
    public static void main(String[] args) {
        // Kullanicidan iki sayi isteyin.
// Girilen sayilar ve aralarindaki tum
// tamsayilari toplayip, sonucu yazdiran bir program yaziniz
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayısı giriiniz:");
        int sayi1=sc.nextInt();
        System.out.println("ikinci sayısı giriiniz:");
        int sayi2=sc.nextInt();
       int toplam=0;
       if(sayi1<sayi2){
           for(int i=sayi1;i<=sayi2;i++){
               toplam+=i;
           }
           System.out.println(sayi1+" ile "+sayi2+" arasındaki sayiların toplamı"+toplam);
       } else if (sayi1>sayi2) {
           for (int i=sayi2;i<=sayi1;i++){
               toplam+=i;
           }
           System.out.println(sayi1+" ile "+sayi2+" arasındaki sayiların toplamı"+toplam);
       }else{
           System.out.println("sayılar eşitttir");
       }

   /* Cuneyt bey den
        int sayi1 = scan.nextInt();
        int sayi2= scan.nextInt();
        int toplam=0;
        for (int i = (sayi1<sayi2 ? sayi1 : sayi2); i<= (sayi1>sayi2 ? sayi1 : sayi2); i++) {
            toplam+=i;
        }System.out.println("toplamları = " + toplam);
     */
    }
}

package L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
       /*
       baslangıc ve bitiş degerleri net(bilinen)deger olan tekrarlarda forloop ama adım sayısı belli olmayıp bir şarta
       bağlı oln durumlarda while kullanırılı.
       TASk01->11 den 20'ye kadar olan tam sayıları print eden code creat ediniz.
        */
        for(int i=11;i<21;i++){
            System.out.print(i+" ");
        }
        System.out.println("  **While cozum **");
        int basla=11;
        while (basla<21){
            System.out.print(basla+" ");
            basla++;
        }
// Task2->7 kere javaCAN yzdır.

        int a=1;
        while (a<8){
            System.out.println(a+". javaCAn");
            a++;
        }
// Task->3 iki basamaklı tek sayıları yan yana prin et
       a=11;
      while (a<100){
          System.out.print(a+" ");
          a+=2;
      }
// Task04 Girilen metni tersten  while loop yazdırılan code
        System.out.println("   **Task ** ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir metin giriniz:");
String metin= sc.nextLine();
int MetinUznlk=metin.length();
while (MetinUznlk>=1){// metnin son karakteri 0 dan büyük eşit olana dek
    System.out.print(metin.charAt(MetinUznlk-1));
    MetinUznlk--;
// Task05 girilen tmsayıya kadar toplamını print eden

}

        System.out.println("Bir tamsayı giriniz:");
        int tmsayi= sc.nextInt();
        int toplam=0;
        while (tmsayi>0){
            toplam+=tmsayi;
         tmsayi--;
        }
        System.out.println("girilen sayıların toplamı:"+toplam);
/*
        System.out.println("   ***Task *** ");

        System.out.println("Bir tamsayı giriniz");
        int sayi= sc.nextInt();
        int toplam=0;

        while (sayi>0){
            toplam+= sayi;
            sayi--;
        }
        System.out.println("girilen sayıların toplamı:"+toplam);
*/
// task 6 girilen tamsayının faktöriyelini
/*
        System.out.println("   ***Task6 *** ");
        System.out.println("Bir tamsayı giriniz");
        int sayi= sc.nextInt();
      int faktoriyel=1;
      while (sayi>0){
          faktoriyel *=sayi;
          sayi--;
      }
        System.out.println(+faktoriyel);
*/
        System.out.println("Bir tamsayı giriniz");
        int sayi= sc.nextInt();
      int faktoriYel=1;
      while (sayi>0){
          faktoriYel*=sayi;
          sayi--;
      }
        System.out.println(+faktoriYel);
    }
}

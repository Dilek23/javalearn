package d11;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*
Java N ve M Boyutlu Dizinin Satırlarının Toplamını Bulma

Bu örnekte N ve M değerlerini kullanıcıdan alıp, iki boyutlu dizi oluşturacağız.
 Daha sonra da dizinin elemanlarını kullanıcıdan alıp, her satırın sonuna o satırın toplamını yazdıracağız.


 örneğin;

 12    12     24
 5     15     20
 12    18     30

 */
      /*  Scanner sc=new Scanner(System.in);
        int toplam;
        System.out.println("Dizinin satır sayısını giriniz:");
int satir= sc.nextInt();
        System.out.println("Dizinin sütun sayısnı girin: ");
int sütun= sc.nextInt();
     int sayi[][]=new int[satir][sütun];
        System.out.println();
        for (int i = 0; i <satir ; i++) {
            for (int j = 0; j <sütun ; j++) {
                System.out.println("bir sayı giriniz  ");
                sayi[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(sayi));
        System.out.println("Girilen dizi:\n");
        for (int i = 0; i <satir ; i++) {
            toplam=0;// kullanıcının girdigi degerleri toplamak için sıfır degerinde int toplam tanımladık
            for (int j = 0; j <sütun ; j++) {
               toplam+=sayi[i][j];
                System.out.print(sayi[i][j]+"\t");// array elemanlarını bir tab boşluk bıraktık
            }
            System.out.println(toplam+"\n");
        }
*/
        Scanner sc=new Scanner(System.in);
        int toplam;
        System.out.print("Dizinin satır sayısını giriniz:");
        int satir=sc.nextInt();
        System.out.print("Dizinin sütun sayısnı giriniz:");
         int sütun= sc.nextInt();
      int sayi[][]=new int[satir][sütun];
        for (int i = 0; i <satir ; i++) {
            for (int j = 0; j <sütun ; j++) {
                System.out.println("dizinin elemanlarını giriniz:");
                sayi[i][j]=sc.nextInt();

            }

        }
        System.out.println(Arrays.deepToString(sayi));
        for (int i = 0; i <satir ; i++) {
            toplam=0;
            for (int j = 0; j <sütun ; j++) {
                toplam+=sayi[i][j];
                System.out.print(sayi[i][j]+"\t");

            }
            System.out.println( toplam+"\n");
        }
    }

    }



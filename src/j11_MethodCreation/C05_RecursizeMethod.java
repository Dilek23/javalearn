package j11_MethodCreation;

import java.util.Scanner;

public class C05_RecursizeMethod {
    /*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */
    public static void main(String[] args) {
        /* faktöriyel girilen sayıdan 1 e kadar olan sayıların çarpımıdır.Task-> girilen syının fktöreyilini hesaplyan metod creat et.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int sayi = sc.nextInt();
        System.out.println(faktöriyel(sayi));

    }//main dşı

    public static int faktöriyel(int a) {
        if (a >= 1) {
            return a * faktöriyel(a - 1);
        } else return 1;

    }
}

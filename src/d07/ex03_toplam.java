package d07;

import java.util.Scanner;

public class ex03_toplam {
    public static void main(String[] args) {
       /*
While döngüsünü kullanarak kullanıcının istediği kadar sayıyı toplayabildiği bir uygulama yazın.

 */
        Scanner scan = new Scanner(System.in);

        double toplam=0;
        double girdi=-1;// 0 dersek hiç bir sayıyı toplamaz.
        double adet=1;
        while (girdi!=0){
            System.out.print("toplanacak sayı giriniz..(çıkmak için 0 yazın!)");
            girdi= scan.nextDouble();
            toplam+=girdi;
            adet++;
            System.out.println("toplam="+toplam);
        }
        System.out.println(adet+"adet sayı girdisi yaptınız"+"\n\ntoplam="+toplam);

    }
}

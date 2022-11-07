package d07;

public class Q04 {
    public static void main(String[] args) {
         /*  Problem Tanımı
    Girilen bir sayı kadar satır ve sütünu olan ve
    sağ kenara dayalı üçgeni basan kodu yazınız.

    Ekran Çıktısı
    Bir sayi giriniz: 5
           *
          **
         ***
        ****
       *****

*/
        for (int i = 1; i <=5 ; i++) {
            for (int j =5-i; j>0 ; j--) {// boşlukları sayarız ilk satırda 4 boşluk var5- i
                System.out.print(" ");
            }
            for (int k= 1; k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int satır =1; satır <=5 ; satır++) {
            for (int sütun = 1; sütun <=satır; sütun++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

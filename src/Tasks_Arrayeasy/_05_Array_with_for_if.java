package Tasks_Arrayeasy;

import java.util.Arrays;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */
       int sayi[]={ 5,6,8,12,14,19};
        System.out.println(Arrays.toString(sayi));
        int teksayılr=0;
        int ciftSayilr=0;
        for (int i = 0; i <sayi.length ; i++) {
            if(sayi[i]%2==1){
                teksayılr+=sayi[i]*(-1);
                System.out.print(+teksayılr);
            } else if (sayi[i]%2==0) {
                ciftSayilr+=sayi[i];
                System.out.print(" "+ciftSayilr);

            }else System.out.println(+0);

        }
        System.out.println("tek ve çift sayı toplamları= "+(teksayılr+ciftSayilr));
    }
}

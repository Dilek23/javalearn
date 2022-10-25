package Tasks_Arrayeasy;

import java.util.Arrays;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

int num[]={25,30,30,35,100};
        System.out.println(Arrays.toString(num));
        int toplam=0;
        for (int i = 0; i <num.length ; i++) {
            toplam+=num[i];

        }
        System.out.println(" num Arrayinin elemanları toplamı = " + toplam);

    }
}
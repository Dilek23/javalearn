package Tasks_Arrayeasy;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        int sayi05[]={15 , 25, 22, 18, 30};
        Arrays.sort(sayi05);
        System.out.println("İkici max. deger"+sayi05[sayi05.length-2]);
    }
}

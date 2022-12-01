package j15_Arrays.Tasks_Arrayeasy;

import java.util.Arrays;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */
int sayi[]={1,2,3,4};
        System.out.println(Arrays.toString(sayi));
boolean flg1=false;
boolean flg4=false;
        for (int i = 0; i <sayi.length ; i++) {
          flg1=(sayi[i]==1?true:false);
          flg4=(sayi[i]==4?true:false);

        }
        System.out.println((flg1 == false && flg4 == false)? false : true);
    }
}
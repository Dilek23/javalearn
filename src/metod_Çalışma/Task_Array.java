package metod_Çalışma;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_Array {
    public static void main(String[] args) {
        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.{2,3,2} , {4,1,5} , {7,2,5}
         */
        int arr[][]={{2,3,2} , {4,1,5} , {7,2,5}};
        //1. yol
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr).replaceAll("2", "6"));
// 2.yol

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
              if(arr[i][j]==2){
                 arr[i][j]=6;

              }

            }

        }
        System.out.println(Arrays.deepToString(arr));

    }
}

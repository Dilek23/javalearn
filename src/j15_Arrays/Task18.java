package j15_Arrays;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        //task-> sayi arr'deki iç Arraylerin toplamını yeni bir arr ye atayıp print eden code creat et.
        //output:int yeniArr[]={6,1,-7}
        // input:int sayi[][]={{1,2,3},{9,-8},{24,10,-41}};

        int sayi[][]={{1,2,3},{9,-8},{24,10,-41}};
        int yeniArr[]=new int[sayi.length];

        for (int i =0; i < sayi.length ; i++) {
            for (int j =0; j <sayi[i].length ; j++) {
                yeniArr[i]+=sayi[i][j];
            }

        }
        System.out.println(Arrays.toString(yeniArr));

    }
}

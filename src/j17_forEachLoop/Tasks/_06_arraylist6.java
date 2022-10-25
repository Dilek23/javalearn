package j17_forEachLoop.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
        ArrayList<Integer >sayi=new ArrayList<>(List.of( 5,4,6,2,1));
        System.out.println(hillNum(sayi));


    }

    private static List<Integer> hillNum(ArrayList<Integer> sayi) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < sayi.size() - 2; i++) {
        if(sayi.get(i+1)< sayi.get(i)&&sayi.get(i+1)>sayi.get(i+2)){
            a.add(sayi.get(i+1));
        }
        }
return a;
    }


}

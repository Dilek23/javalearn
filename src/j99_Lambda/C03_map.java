package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_map {
    // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz
    public static void main(String[] args) {
        List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));
        ciftKarePrint(sayi);
        System.out.println("\n****");


    }
public static void ciftKarePrint(  List<Integer> sayi){
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t->t*t).forEach(C01_LambdaExpression::yazdir);
}


}

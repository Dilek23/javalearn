package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Task->tek elemanlarinin kuplerinin 1 fazlasini
public class Task1 {
    public static void main(String[] args) {
        List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));
        tekKüpPrint(   sayi);
        System.out.println("\n***");
        ciftKarekökPrint(  sayi);
    }

    public static void tekKüpPrint(  List<Integer> sayi){
        sayi.stream().filter(C01_LambdaExpression::tekMİi).
               // map(t->(t*t*t)+1).yada
                       map(t->(int)Math.pow(t,3)+1).
                forEach(C01_LambdaExpression::yazdir);
    }
// Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
public static void ciftKarekökPrint(  List<Integer> sayi){
    sayi.stream().filter(C01_LambdaExpression::ciftMi).
            map(t->(int)Math.sqrt(t)).
            forEach(C01_LambdaExpression::yazdir);
}

}





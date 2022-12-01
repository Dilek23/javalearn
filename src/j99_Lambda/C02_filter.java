package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class C02_filter {
    public static void main(String[] args) {
        java.util.List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        ciftFunctional4(sayi);
        System.out.println("\n***");
        printelFunctional3(sayi);
    }
    public static void printelFunctional3(List<Integer> sayi) {

        sayi.stream().filter(t->t%2==0).forEach(C01_LambdaExpression::yazdir);//C01 den yazdır metodu call edildi
    }
//Task : "Functional Programming":cincix code kullanarak list elemanlarının 35 den küçük  çiftlerini
// aynı satirda aralarında bosluk olacak sekilde print ediniz.
public static void ciftFunctional4(List<Integer> sayi) {
sayi.stream().
        //filter(C01_LambdaExpression::ciftMi).filter(a->a<35).
       filter(t->t<35&&t%2==0). // 2. cözüm
        forEach(C01_LambdaExpression::yazdir);

}
}


package j99_Lambda;

import java.util.List;

public class Task {
    public static void main(String[] args) {
        //Task : "Functional Programming":cincix code kullanarak list elemanlarının 34 den buyuk YADA
        // çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    }
        public static void ciftFunctional4(List<Integer> sayi) {
            sayi.stream().
                    //filter(C01_LambdaExpression::ciftMi).filter(a->a<35).
                            filter(t -> t < 35 && t % 2 == 0). // 2. cözüm
                    forEach(C01_LambdaExpression::yazdir);


        }

}

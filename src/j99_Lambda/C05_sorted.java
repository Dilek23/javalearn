package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_sorted {
    public static void main(String[] args) {
        List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));
        // List<Integer> sayi=new ArrayList<>(Arrays.asList(2,3,12,5,7));
      // Tsk-> list in çift elemanlarını  karelerini kücükten büyüğe
        karelerinikcktenSirala(  sayi);
        System.out.print("***\n");
        tekkarelerinibyktenSirala(  sayi);
        System.out.print("***\n");
    }
    public static void karelerinikcktenSirala( List<Integer> sayi){
        sayi.stream().filter(C01_LambdaExpression::ciftMi).
                map((t->t*t)).sorted().forEach(C01_LambdaExpression::yazdir);

        //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
      //Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.
    }
// Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.

    public static void tekkarelerinibyktenSirala( List<Integer> sayi) {
sayi.stream().filter((C01_LambdaExpression::tekMİi)).map(t->t*t).sorted(Comparator.reverseOrder()).
        forEach(C01_LambdaExpression::yazdir);
    }
}

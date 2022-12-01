package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
kullanımı yaygındır pratiktir.
Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

*/
public class C04_reduce {
    // listin çift elemanlanın karelerinin en büyügünü print et
    public static void main(String[] args) {
        //Lambda -> Stream API
        List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));
       // List<Integer> sayi=new ArrayList<>(Arrays.asList(2,3,12,5,7));
        System.out.println("\n  **** ");
        ciftKareMaxPrint(sayi);
        System.out.println("\n  **** ");
        elemnTopla(sayi);
        System.out.println("\n  **** ");
        ciftCarp(sayi);
        System.out.println("\n  **** ");
        minBul( sayi);
        System.out.println("\n  **** ");
        sayidnByk( sayi);
    }//Main sonu
    public static void ciftKareMaxPrint(  List<Integer> sayi) {
        // Optional maxElaman=sayi.
        //     stream().filter(C01_LambdaExpression::ciftMi).map(t->t*t).reduce(Math::max);// max elemanı istedigi için elimizde tek
        //     // eleman olur ve bir list oluşmz foreach gerek kalmadan yazdırır.
        //     System.out.println(maxElaman);
        System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).
               // map(t->t*t).reduce(Math::max));
         reduce(Integer::max));// spesifik class dha hızlı calısır çünkü sınırları daha dar.

    }
    // Task: listteki tum elemanların toplamını print ediniz.
    public static void  elemnTopla(List<Integer> sayi){
        System.out.println(sayi.stream().reduce(Integer::sum));
        Optional<Integer> toplam=sayi.stream().reduce(Integer::sum);
        System.out.println("toplam= "+toplam);
       sayi.stream().reduce(0,(a,b)->a+b);//Lambda expression
        /*
        a: ilk degerini her zaman atanan identidy degerden alır
        b:degerini her zaman stream akışından alır.
        a: şlk degerden sonraki degerlerini action (işlem body) den alır.

         */
    }
//Task-> Listteki çift elemanların carpımını yzdırın
    public static void ciftCarp(List<Integer> sayi){
        System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).reduce(Math::multiplyExact));//Math. classdan met.call
        System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).reduce(1, (t, u) -> t * u));//lambda expr.

    }
// Task-> list teki elemanlardan en kucugunu 4 farklı yöntem ile print et.
   public static void minBul(List<Integer> sayi){
       System.out.println(sayi.stream().reduce(Math::min));//1.yol metod refere
       System.out.println(sayi.stream().reduce(Integer::min));//2.yol  metod refere
       System.out.println(sayi.stream().reduce(C04_reduce::myMethodMinBul));//3.yol  metod refere
       System.out.println(sayi.stream().reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u));//4.yol  metod refere
       System.out.println(sayi.stream().reduce(Integer.MAX_VALUE,(t,u)->Math.min(t,u)));//5.yol  metod refere
// ilk üç yolda optional sonuccıkar cünkü sonuc kesindegildir ancak diger çözümlerde çıkacak integer sonuc bellidir opsiyon gerek yok
   }
  public static int myMethodMinBul(int a,int b){// meth refere için seed tohum met.
        return a<b?a:b;
  }
  // Tassk->listedeki 24'ten büyük en küçük tek sayiyi print ediniz

    public static void sayidnByk(List<Integer> sayi){

        System.out.println(sayi.stream().filter(t -> t > 24 && t % 2 == 1).reduce(Integer::min));
    }

}

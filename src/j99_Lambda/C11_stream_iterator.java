package j99_Lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C11_stream_iterator {
    public static void main(String[] args) {
        //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endExclusive'e (exclusive) kadar sıralı bir IntStream return eder.
        //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.

// Structured Programming(Amele coding)

        System.out.println("TASK01toplamAmele= "+toplamAmele(10));
        System.out.println("****");
        System.out.println("TASK01toplamAmele= " + toplaCincix(10));
        System.out.println("****");
        System.out.println("Cift topla= "+toplaCift(24));
        System.out.println("****");
        System.out.println("ilk on çift sayıtoplaİlkXsay() = " + toplaİlkXsay(10));
        System.out.println("****");
        System.out.println("toplaİlTekkXsay(10) = " + toplaİlTekkXsay(10));
        System.out.println("****");
        ikiniİlkXKuvveti(7);
        System.out.println("****");
        istenenSayininkXKuvveti( 7,5);

    }//main

public static int toplamAmele(int x){
        int toplam=0;
    for (int i = 0; i <=x ; i++) {
        toplam+=i;

    }
    return toplam;
}
// Functional Programming (cincix code...)

public static int toplaCincix(int x){

   return IntStream.range(1,x+1).//1 dahil x+1 hariç ->1,2,3,...x int sayilardan aralık tanımland
    sum();//akışa giren 1,2,3,..x tam sayıları toplandı

}
////TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
public static int toplaCift(int x) {

    return IntStream.
           // range(1, x + 1)
    rangeClosed(1,x)//rangeClosed bitiş degeri de dahil olur
            .filter(C01_LambdaExpression::ciftMi).sum();//1 dahil x+1 hariç ->1,2,3,...x int sayilardan aralık tanımland
}
//TASk03-> ilk x pozitif çift tamsayiyi toplayan code creat ediniz.
    public static int toplaİlkXsay(int x){
      return   IntStream.iterate( 2,t->t+2).// 2 den başlayıp 2 artırılan tekrar işlemi tanımlandı->2,4,6,8
        limit(x).//akıstaki ilk x eleman akısa alınır
        sum();
    }
    //TASk03-> ilk x pozitif tek tamsayiyi toplayan code creat ediniz.
    public static int toplaİlTekkXsay(int x) {
        return IntStream.iterate(1, t -> t + 2).limit(x).sum();
    }
    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void ikiniİlkXKuvveti(int x) {
       IntStream.iterate(2, t -> t * 2).limit(x).forEach(C01_LambdaExpression::yazdir);
//TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.

//TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.

//TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
    }
    public static OptionalInt istenenSayininkXKuvveti(int istenenSayi, int x) {
       return IntStream.iterate(istenenSayi,t->t*istenenSayi).limit(x).skip(x-1).findFirst();
    }

}

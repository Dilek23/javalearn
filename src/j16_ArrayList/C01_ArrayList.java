package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
        /*
     Array List genel Tanimi:

          ArrayList<Type> arrayListName = new ArrayList<Type>();
          List<Type> arrayListName = new ArrayList<>();

           1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
              - ArrayList<int> hatali bir tanimlamadir. Wrapper class dedigimiz object türünden olmalidir
              - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir
              - int'n wrapper class'i        --> Integer'dir
              - double'un wrapper class'i    --> Double'dir. vs...

          2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
              - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
          3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


   key word: List<Wrapper Class> name=

   List'e assaign etme(atama) :
   List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
   List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
   List<wrapper Class> name = new ArrayList<>() *****doğru
   List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
   ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

   List'e ilk değer atama (initialize):....
   1.yol : asList();
   ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
   2.yol : Listof();
   ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

   ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
   Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.


   Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

 */
     int sayi=33;// tek bir data saklayabilen variable
     int sayi1[]=new int[5];// 5 int deger saklayabilen yapı
     int sayi2[][]=new int[5][6];// 5*6 30 tane
        ArrayList<Integer> sayilist=new ArrayList<>();//  istenildigi kadar int deger saklayan yapı

     ArrayList<Integer>listSayi=new ArrayList<>();// boş integer type list oluşturuldu.
     // 1.yol add() metodu.
     listSayi.add(10);// liste ilk eleman olarak 10 eklendi.
        System.out.println("list sayi"+listSayi);
listSayi.add(39);
        listSayi.add(72);
        listSayi.add(41);
        listSayi.add(41);
        System.out.println("listSayi = " + listSayi);
      // 2. yol-> Array.asList();metodu
      ArrayList<String>listİsim=new ArrayList<>(Arrays.asList("Muharrem","Nur","Tugba"));
        System.out.println("listİsim = " + listİsim);
        // 3.yol-> Lis.of metodu.
        ArrayList<String>listUlke=new ArrayList<>(List.of("Almanya","America","Isvec"));
        listSayi.add(2,14);// liste index 2' ye 14 degerini ekledi.2. indexteki eski eleman bir index kaydırıldı
        System.out.println("listUlke = " + listUlke);
        System.out.println(listSayi);
    }
}

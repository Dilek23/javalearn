package j99_Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class C10_object {
    public static void main(String[] args) {
        /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */
Universite u01=new Universite("Bogazici","Matematik",571,93);
Universite u02=new Universite("İstanbuli","Matematik",572,77);
Universite u03=new Universite("Otdu","Hukuk",571,52);
Universite u04=new Universite("Gata","tıp",571,63);
Universite u05=new Universite("Yildiz","Matematik",571,100);

        List<Universite>unv=new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05));
        System.out.println("task1 " + unv);
        System.out.println("\n***");
        System.out.println(yuzOndnazMi(unv));
        System.out.println("\n***");
        System.out.println("Task03"+enAzbirMatemkVarmİ(unv));
        System.out.println("\n***");
        System.out.println(kcktenBuyuge(  unv));
        System.out.println("\n***");
        System.out.println("Task05 = " + notOrtbyktenkucge(unv));
        System.out.println("\n***");
        System.out.println("Task06"+ogrnciSayisiEnaz(unv));
        System.out.println("\n***");
        System.out.println("Task07 = " + notOrt63BykOgrnToplam(unv));
        System.out.println("\n***");
        System.out.println("Task08 = " + notOrt33denbyk(unv));
    }//main sonu
    //task -> not ortalamalarının 74 den büyük old. kontorl eden
    public static boolean notOrt74Byk(  List<Universite>unv){
        return unv.stream().allMatch(t->t.getNotOrt()>74);
    }
    //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
public static boolean yuzOndnazMi( List<Universite>unv){
        return unv.stream().allMatch(t->t.getOgrcSayisi()>=110);
}
//Task 3-> universitelerde herhangi birinde matematik olup olmadıgını kontrolet
public static boolean enAzbirMatemkVarmİ( List<Universite>unv){

       return  unv.stream().anyMatch(t->t.getBolum().toLowerCase().contains("mat"));

}
// üniversieleri ogrn sayılarına göre bykten kücüge sırala
    public static List<Universite> kcktenBuyuge( List<Universite>unv){
      return   unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).
                collect(Collectors.toList());//akıştaki elemanlar liste atandı.
        // colec(Collectorc.coll)
    }
//task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.

    public static List<Universite> notOrtbyktenkucge( List<Universite>unv){
        return unv.stream().sorted(Comparator.comparing(Universite::getNotOrt).reversed()).limit(3).collect(Collectors.toList());
    }
//task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
public static List<Universite> ogrnciSayisiEnaz( List<Universite>unv){
    return unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi)).limit(2) .skip(1).
    collect(Collectors.toList());
}
//task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.
    public static int notOrt63BykOgrnToplam(List<Universite>unv){
     return    unv.stream().filter(t->t.getNotOrt()>63).mapToInt(t->t.getOgrcSayisi()).sum();//Maptoınt akıstaki elemanların data typnı parametre
        //degere göreupdate eder.
    }
    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static OptionalDouble notOrt33denbyk(List<Universite>unv){
      return unv.stream().filter(t->t.getOgrcSayisi()>333).mapToDouble(t->t.getNotOrt()).
              average();//akıştaki elemanları
    }


}

package j10_StringManipulation;

import java.util.Scanner;

public class C07_IndexOff {
    public static void main(String[] args) {
/* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/
        String str="Good";
        System.out.println("ilk görülen o nun yeri index nosu:"+str.indexOf('o'));//1
        System.out.println("Go nin yeri index nosu:"+str.indexOf("Go"));//3
        System.out.println("d nin yeri index nosu:"+str.indexOf("D"));//-1// harfi buyuk kuçuk girme durumunda deger-1
        System.out.println("od nin yeri index nosu:"+str.indexOf("od"));//2
/** lastIndexOf()
 *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
 *  indexOf un sondan olan hali fakat index numaraları değişmez.
 *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
 *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
 */
String isim="mustafa nizamoglu";
        System.out.println(isim.indexOf('a'));
        System.out.println(isim.lastIndexOf('a'));//11 lastindexof sondan kontrole başlar ancak indeks baştan itibaren sayılır.
        System.out.println(isim.lastIndexOf("fa"));// 5
/*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence=sc.nextLine().toLowerCase();
      if (sentence.indexOf("java")==-1){
          System.out.println("The entered sentence doesn't contain Java");

      } else if (sentence.indexOf("java")==sentence.lastIndexOf("java")) {
          System.out.println("The entered sentence contains  one java");
          
      }else System.out.println("The entered sentence contains more than one  java");


    }
}

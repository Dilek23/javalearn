package j09_TASKs;

import java.util.Scanner;

public class C03_Charat {
    public static void main(String[] args) {
  /*
  cHar at() metodu parametse int olarak girilen index deki char değerini return eder.
  index değeri 0 dan başlar.
   */
        String sehir="İstanbul";

     char besinciİndex =sehir.charAt(5);
        System.out.println(besinciİndex);
// son index karakteri--> lenght()-1
sehir.charAt(sehir.length()-1);
// ilk karakter charat?
        //System.out.println(sehir.charAt(0));
 // TRİCK char at indeks boyutnuz geçerse rte verir.
        // task--> istanbul kelimesini ortadaki karakterini yaz
        System.out.println(sehir.length()/2);
        Scanner sc=new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime=sc.nextLine();
        if( kelime.length()%2!=0){
            System.out.println((kelime.charAt((kelime.length()-1)/2)));

        }else System.out.println("girilen kelimenin orta karakteri yoktur");







    }
}

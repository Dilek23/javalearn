package j15_Arrays.Tasks_Arrayeasy.Odevler;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    static double toplam=0;
    static ArrayList<Integer>notlr=new ArrayList<>();
    public static void main(String[] args) {

        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        Scanner sc=new Scanner(System.in);

        int grlnnot;
        int trch=1;

while (trch==1){
    System.out.println("Notları giriniz");
    grlnnot=sc.nextInt();
    notlr.add(grlnnot);
    toplam+=grlnnot;
    System.out.println("not girmeye devam edecekseniz EVET için=1, hayır için=0 tuşlayın");
    trch=sc.nextInt();
}

        ortlBuyk();

    }

    private static void ortlBuyk() {
        double ort=toplam/ notlr.size();
        System.out.println("girilen notlar ortalamsı="+ort);
        System.out.println("Ortalamanın üstünde kalan notlar=");
        for (int i = 0; i < notlr.size() ; i++) {
            if(notlr.get(i)>ort){
                System.out.println( notlr.get(i));
            }
        }
        System.out.println();
        System.out.println();
    }


}

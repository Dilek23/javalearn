package TaskOdevler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T05_OgrtmnNotu { /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
    static int ogrncisaysı = 0;
    static int toplam = 0;
    static double ort = 0;
    static ArrayList<Integer> notlar = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ogrenci sayısını giriniz:");
        ogrncisaysı = sc.nextInt();

        for (int i = 1; i <= ogrncisaysı; i++) {
            System.out.print(i + " .ogrencinin notunu giriniz:");
            int notgiris = sc.nextInt();
            notlar.add(notgiris);

        }
        System.out.println(orTalamaUstu(notlar));

        System.out.println("Not ortalaması= " + orTalama(notlar));

    }

    private static List<Integer> orTalamaUstu(List<Integer> notlar) {
        int ortgcen = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) > ort) {
                list.add(notlar.get(i));
                ortgcen++;
            }

        }
        return list;
    }





    private static double orTalama(ArrayList<Integer>notlar) {

        for (int i = 0; i < notlar.size() ; i++) {
            toplam+= notlar.get(i);
            ort=toplam/ (notlar.size());
        }
return ort;
    }


}

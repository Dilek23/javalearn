package j17_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_forEachLoop {
    public static void main(String[] args) {
     /*
     for loop un gelişmiş halidir.
     avantajları; 1.clean code- yazım kolaylıgı
     2.kod okuma kolaylıgı
     3. hata yapma riskini azaltır
      */
        List<Integer>sayiList=new ArrayList<>((List.of(16,5,2,33,22,27,41,24)));
        // task list elemanlarını ayrı satırlara print ediniz.
        for (int i = 0; i <sayiList.size() ; i++) {
            System.out.println(sayiList.get(i)+" ");
        }
      for(Integer a:sayiList){
          System.out.println(a+" ");
      }

      // task list elemanlarının ilk 3 eleman hariç tek olanları pr,nt et.

        for (Integer a : sayiList.subList(3, sayiList.size())) {
            if (a % 2 == 1) {
                System.out.println(a + " ");
            }
        }
        System.out.println("   ***  task3   ***   ");
        //task list elemanlarinın 2 ile 5 index  arasındaki (2,3,4,5) elemanların toplamını  print ediniz.
        int toplam=0;
        for (int a:sayiList.subList(2,6)){
            toplam+=a;
        }
        System.out.println("toplam = " + toplam);

        // task list elemanlarınn 2 ile 5 index arasındaki (2,3,4,,5 ) toplamını?

        }


    }



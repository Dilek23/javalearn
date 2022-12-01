package j36_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task04 {

    ///			KELİME ANALİZİ

    /*
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */



    public static void main(String[] args) {
 String str="iki iki dört  eder";

     cmleSplitEt(str);


        }

    private static void cmleSplitEt(String str) {
        HashMap<String,Integer>msp=new HashMap<>();
        ArrayList<String>cumleBol=new ArrayList<>(Arrays.asList(str.split("\\.")));
        System.out.println("cumleBol = " + cumleBol);
        int counter=1;
        for (String a:cumleBol  ) {
           if(!msp.containsKey(a)){
               msp.put(a,counter);
           }else if((msp.containsKey(a))) msp.put(a,counter++);

           }
        System.out.println("msp = " + msp);
        }

    }




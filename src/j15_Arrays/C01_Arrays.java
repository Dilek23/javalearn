package j15_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        /*
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */
        // Array tanımlama...
        int arr[];// deklare edilen(tanımlanan)ama atanmayan int type array
        // tanımlanan array atama yapılmdan kullanılmz...
        String isimArr[]={" muharrem","enise","cebrail","nazım","özge"};
int sayıArr[]=new int[5];//java heap memoryde 5 default 0 olan int array creat edildi.
                         //[0,0,0,0,0]

// Array a eleman ekleme...
        sayıArr[2]=34;
        sayıArr[0]=35;
        sayıArr[1]=34;
        sayıArr[3]=61;
        sayıArr[0]=34;// 0 index array elemanı 34 ile update edildi
        // array eleman sayısı boyut degeri
        System.out.println(sayıArr.length);
        // Array son elemanı...
        System.out.println("array son elemanı = " +isimArr[ isimArr.length - 1]);//özge
        isimArr[isimArr.length-1]="QA Özge hanım";// array son elemanı update edildi.

        //Array de olamayn eleman

        // **** interwiev sorusu sayıArr[11]=23;// cte vermez ama olmayan eleman rte verir_> array run time da oluşur.
       // array elemanlarını yazdır...
        for (int i = 0; i < isimArr.length ; i++) {
            System.out.print(isimArr[i]+" , ");
        }
        System.out.println(Arrays.toString(isimArr));// isim array stringe cevirdi
// task sayıArr elemnlarından degeri tek olanları print et
        for (int i = 0; i < sayıArr.length ; i++) {
            if(sayıArr[i]%2==1){
                System.out.println(sayıArr[i] + " ");
            }

        }
// task sayıarr çift index elemanlarını print et.
        for (int i = 0; i < sayıArr.length ; i+=2) {
            System.out.print(sayıArr[i]+" ");

        }
// Task-> isim array 5 harfli olan elemanlarından oluşaan arrayın
        String yeniArr[]=new String[isimArr.length];


        for (int i = 0; i < isimArr.length ; i++) {

            if(isimArr[i].length()==5){
                yeniArr[i]=isimArr[i];

            }
        }
        System.out.println(Arrays.toString(yeniArr));
        // array elemanları naturel (k->b: ascendig b->:descending alfabetik) sıralama için sort() metod kullanılır.
        Arrays.sort(isimArr);//isim elemanları naturel sıralanır.

        System.out.println(Arrays.toString(isimArr));
        System.out.println(Arrays.toString(sayıArr));
 Arrays.sort(sayıArr);
        System.out.println(Arrays.toString(sayıArr));
    }
}

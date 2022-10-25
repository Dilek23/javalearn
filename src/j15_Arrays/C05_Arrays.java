package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        // Array copy... copyOf(arr,newLenght);  girilen arry in newLenght kadar ilk elemanını koyalar.



       int sayi[]={63,21,47,27,35,12,36,31,46,24};
       int yeniArr[]= Arrays.copyOf(sayi,5);
        System.out.println("sayıdan ilk 5 eleman kopyalanan yeni array:"+Arrays.toString(yeniArr));
   int baskaArr[]=Arrays.copyOfRange(sayi,3,8);// 3 dahil 8 hariç index elemanlar kopyalanır.
        System.out.println("sayı arrayden özel kopylanan baska array :"+Arrays.toString(baskaArr));
// Array'ı belirli bir eleman ile update(set)etme...fill(arr,value);
        Arrays.fill(sayi,99);//
        System.out.println("sayı arr in  99 ile fullemiş hali"+Arrays.toString(sayi));
    Arrays.fill(sayi,3,7,33);// 3.4.5.6. index elemanlar 33 ile update edildi.
        System.out.println("3 ile 7 index arası "+Arrays.toString(sayi));
        // bir sitede her birinde 10 dairelik 8 katlı apt var.nasıl arry olarak tanımlanır.->3 boyutlu.
          //Trick-> Arrayi uzunlukları ile tanımlamak için inner

        int site[][][]=new int[6][8][10];
        // 24 kişilk 3 sınıf ve 21 kişilk 5 sınıfı olan okul nasıl array tanımlanır.
        int sınıf24[][]=new int[3][24];
        int sınıf[][]=new int[5][21];
        int arr1[][]=new int[3][5];
        // MdArray e eleman ekleme...
        arr1[2][4]=35;
        arr1[0][3]=34;
        System.out.println(arr1[0][3]);
// elemanları girrek arr tanımlama.
        int arr[][]={{1,2,3},{10,20},{101}};
        //101 eleman index arr[2][0]

        // MdArray elemanları print etme.Array toString olmadan dogrudan yazılmaz yazarsa referans verir value degerr vermez.
        System.out.println(arr[1]);// [I@42d3bd8b array dogrudan yazdırıldıgı için referans degeri yazdırır.

        System.out.println(Arrays.toString(arr[1]));
        System.out.println(arr[1][0]);

        System.out.println(Arrays.deepToString(arr));//
        System.out.println(Arrays.toString(arr));//[[I@5f2050f6, [I@42d3bd8b, [I@3b81a1bc] ddeptostring kullanmayınca referans gelir.

    }
}

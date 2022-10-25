package j15_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //Array elamanı varlığını kontrol etme...
        int arr[]={67,97,20,63,43,34,54,24,16,7,55,17};
        int sayi=34;
        boolean flag=false;//bayrak
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==sayi){
                flag=true;
                break;
            }
        }
      if(flag){
          System.out.println("aradıgınız sayı arrayde var");
      }else{
          System.out.println("aradığımız sayı arryda yok");
      }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 34));// bu metod aranan elemanın arrayde arayıp indeksini  return eder.
        System.out.println(Arrays.binarySearch(arr, 16));
        System.out.println(Arrays.binarySearch(arr, 5));
// trick-> binarySearch metodu arrayde olmayan elemanı calısırsa sonuc olrak eger bu elemen olsaydı kacıncı sırada olurdu cevabını - ile verir
        System.out.println(Arrays.binarySearch(arr, 99));
    }
}

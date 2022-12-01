package j15_Arrays.Tasks_Arrayeasy;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
        int sayi05[]={ 12,2,5,15,8};
        int max=sayi05[0];

        for (int i = 0; i <sayi05.length ; i++) {
          max=Math.max(max,sayi05[i]);

        }
        System.out.println("Sayı arrayinin en büyük elemanı= "+max);
    }
}


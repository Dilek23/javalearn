package Tasks_Arrayeasy;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */
        int sayi04[]={14 , 19 , 5 , 21};
        int min=sayi04[0];
        for (int i = 0; i <sayi04.length ; i++) {
            min=Math.min(min,sayi04[i]);


        }
        System.out.println("Sayı Arrayinin minimum degeri= "+min);
    }
}


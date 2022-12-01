package j15_Arrays.Tasks_Arrayeasy;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */
        int sayi06[]={23,10, 14 , 21 ,23 , 10 ,4};
        int ortlMa=0;
        int toplam=0;
        int elemnsayisi=0;
        for (int i = 0; i <sayi06.length ; i++) {
            elemnsayisi++;
            toplam+=sayi06[i];
            ortlMa=toplam/elemnsayisi;


        }
        System.out.println("elemanların ortalamsı= "+ortlMa);
    }
}
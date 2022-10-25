package j15_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
// Array eşitlik kontrolü...equals metodu->true false indeks ve value kontrolu yapar.
       int sayi1[]={39,3,72,63,84};
       int sayi2[]={84,72,63,3,39};
        System.out.println(Arrays.equals(sayi1, sayi2));
        Arrays.sort(sayi1);
        Arrays.sort(sayi2);
        System.out.println(Arrays.equals(sayi1, sayi2));
// Array'i Stringe cevirme.... toString(arr);->verilen arr!i string tipi cevirir.
        String str=Arrays.toString((sayi1));
        System.out.println("str = " + str);// *** Önemli trick interwivev sorusu Arrayin tum elemanları String olarak tanımlandı.
        // [ köşeli parantezde dahil
        System.out.println(str.substring(6));

    }
}

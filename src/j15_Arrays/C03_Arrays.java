package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        // String data array'a cevirme...split() girilen parametre degere göre String ifade parcalanır.
        String str="javaCAN'lara selam olsun. en kısa zamanda bolcana offer sonrası TUZLAbalık";
        // task-> string ifadeyı kelime sayısını print eden cod?

       String strArr[]= str.split(" ");// strher "" karatere göre parcalanır.
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);
        // Strindeki harf sayısını print et.

        String harfArr[]=str.split("");// string hiçlige göre parcalandı sonra yazdırıp saydırdık.
        System.out.println(Arrays.toString(harfArr));
        System.out.println(harfArr.length);
    }
}

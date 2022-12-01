package j15_Arrays.Tasks_Arrayeasy;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String s="Hello World";
        String arr[]=s.split("");
        for (int i = arr.length-1; i>=0 ; i--) {
            System.out.print(arr[i]+" ");
        }

    }
}
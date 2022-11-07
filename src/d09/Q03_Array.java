package d09;

import java.util.Scanner;

public class Q03_Array {
    public static void main(String[] args) {
        // kullanıcıdan bir cumle isteyin ve kelime sayısını bul.
        Scanner sc=new Scanner(System.in);
        System.out.print("Cumle giriniz:");
        String a = sc.nextLine();
        String arr[] = a.split(" ");
        System.out.println(arr.length);

    }
}

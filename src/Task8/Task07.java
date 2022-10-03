package Task8;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        int sayi1= sc.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz:");
        int sayi2=sc.nextInt();
        System.out.print("Lütfen üçüncü sayıyı giriniz:");
        int sayi3= sc.nextInt();
        enKucuksayi(sayi1,sayi2,sayi3);




    }//main dısı

    private static void enKucuksayi(int a, int b, int c) {
        if (a<b&&a<c){
            System.out.println("En küçük sayı "+a);
        }else if(b<c&&b<a){
            System.out.println("En küçük sayı "+b);

        }else System.out.println("En küçük sayı "+c);


    }


}


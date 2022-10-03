package Task8;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner sc=new Scanner(System.in);
        System.out.print("lütfen bir yıl giriniz:");
        int yil=sc.nextInt();
        Artıkyl(yil);


    }// main dısı

    private static void Artıkyl(int a) {


        if (a % 4 == 0) {
            System.out.println("True");
        } else System.out.println("False");
    }



}

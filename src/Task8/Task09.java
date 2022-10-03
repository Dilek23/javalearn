package Task8;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir saat degeri söyleyin ");
        int saat= sc.nextInt();
        howManySeconds(saat);


    }//Maindısı

    private static void howManySeconds(int a) {
      int saniye=a*3600;
        System.out.println("Girdiğiniz saatin saniye degeri: "+saniye);
    }


}

package d01;

import java.util.Scanner;

public class Q03_NestedStatement {/*
    Kullanici dan yas bilgisini alarak

       oy kullanma yasi :
      age >= 18  ==> oy kullanmaya uygun
      age >= 70  ==> uc kez oy kullanabilir
      70 > age >=50 ==> iki kez oy kullanabilir
      50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("yasınızı giriniz");
        int age= sc.nextInt();

 if(age>=18){
     System.out.println("yasınız oy kullnmaya uygun");

 } else if (age>=70) {
     System.out.println("uc kez oy kullanabilirsiniz");

 }else
      System.out.println("oy kullanabilmek icin 18 yas ve ustu olmaniz gerekir");


    }
}

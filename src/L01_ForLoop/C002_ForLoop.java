package L01_ForLoop;

import java.util.Scanner;

public class C002_ForLoop {
    public static void main(String[] args) {
// girilen sayıdan 100 e kadar 4 un katı tamsayılrı print et
        Scanner sc= new Scanner(System.in);
        System.out.println("lütfen bir pozitif  sayı giriniz");
       int sayi= sc.nextInt();
       if(sayi>100){
           System.out.println("Sayı yüzden küçük olmalı");
       }else{
           for(int i=sayi; i<100;i++){
               if(i%4==0){
                   System.out.println(i+" ");
               }
           }
       }



    }
}

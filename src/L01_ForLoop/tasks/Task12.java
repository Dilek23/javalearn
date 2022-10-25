package L01_ForLoop.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
    /*
    girilen bes sayının 10 ile 20 arası hariç digerlerinin toplamını hesap eden code creat et.
     */
        Scanner sc=new Scanner(System.in);
        int toplam=0;//ilk degeri sıfır olaan toplama etki etmeyecek bir veriable

        for(int i=1;i<=5 ; i++){
            System.out.println(i+".sayıyı giriniz:");
            int sayı= sc.nextInt();
            if(sayı<=10 || sayı>=20){
                toplam+=sayı;

            }
        }
        System.out.println("girdiginiz sayıların istenen sartta toplamı:"+toplam);





    }
}

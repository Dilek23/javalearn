package task4;

import java.util.Scanner;

public class _03_if_statement3 {

    public static void main(String[] args) {

    /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */

Scanner sc=new Scanner(System.in);
        System.out.println("str1 ve str2 değerlerini giriniz:");
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        if(str1==str2) {
            System.out.println("Str1 is equal to Str2");
        }
              if (str1!=str2){
                System.out.println("str1 is NOT equal str2");
            }



    }
}

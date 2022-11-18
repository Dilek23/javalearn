package j29_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
    /*
    girilen 6 karakterden az on karakterden fazla olmamasını kontrol eden code creat et.
     */
        Scanner sc=new Scanner(System.in);
        System.out.println("pasword girin:");
        String password= sc.next();
        try {
            if (password.length()<6){
                throw new IllegalArgumentException("6 karakterden az girdin :(");
            }else if(password.length()>10){
                throw new IllegalArgumentException("10 karakterden fazla girdin ");
            }else System.out.println("pasword gecerli:"+ password);
        }catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println("pasword gecersiz ");
        }
        System.out.println("hata handle edildi ");

    }



}

package i01_interviewQuestions;

import java.util.Scanner;

public class Q03_PrimeNumber {
    public static void main(String[] args) {


    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
    Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi= sc.nextInt();
        boolean flag= true;
        if(sayi>=2){
            for (int i = 2; i <sayi ; i++) {
                if (sayi%i==0){
                    flag=false;
                    break;
                }

            }
            if (flag==true) System.out.println("Asaldır...");
            else System.out.println("Sayi asal degildir...");
        }else System.out.println("asal degildir");

    }


}

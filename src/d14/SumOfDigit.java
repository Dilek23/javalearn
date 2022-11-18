package d14;

import java.util.Scanner;
/*
Verilen string ifade içindeki sumofdigit adında bir metod creat ederek integer sayıların toplamını yazınız:
input:J4\/4$34$₺
OUTPUT:16
 cHARACTER.İSdİGİT()
 integer.ValueOf()
 */
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.nextLine();
        sumOfDigit(str);


    }

    private static void sumOfDigit(String str) {
        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
        if(Character.isDigit(str.charAt(i))){
            sum+=Integer.valueOf(""+str.charAt(i));

        }
        }
        System.out.println("sayısal degerlerin toplamı = " + sum);
    }
}

package Task_WhileLoop_odeveler;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.
Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
int num= sc.nextInt();
for(int i=0;i<num;i++){
    if(i%2==1){

        System.out.print(i+" ");
    }

        }
        System.out.println(num+" a kadar olan tek sayılar:");
    }
}

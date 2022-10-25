package tasks_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println(" 7 adet sayı sayı giriniz:");
       int numbers[]=new int[7];
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(i+". elemanı giriniz");
            numbers[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i <=numbers.length-1; i++) {
           if(numbers[i]%2==1){
               System.out.print(numbers[i]+" ,");
           }
        }
    }
}

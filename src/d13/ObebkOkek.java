package d13;

import d11.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ObebkOkek {
    /*
    Girilen iki sayinin EBOB ve EKOKlarını print eden metod  creat ediniz:
  Ekok(a,b)=|a*b|/ebob(a.b)
     */
    public static void main(String[] args) {
      /*  Scanner sc=new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int num1=sc.nextInt();
        System.out.print("ikinci sayiyi giriniz:");
        int num2=sc.nextInt();
        System.out.println("obeb(num1,num2) = " + obeb(num1, num2));
        System.out.println("okekBul(num1,num2,obeb(num1,num2)) = " + okekBul(num1, num2, obeb(num1, num2)));

    }

    private static int okekBul(int num1, int num2, int obeb) {


        return Math.abs(num1*num2)/obeb(num1,num2);
    }


    private static int obeb(int num1, int num2) {
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 1; i <=Math.max(num1,num2) ; i++) {
            for (int j =1; j <=Math.min(num1,num2) ; j++) {
                if (num1%i==0&&num2%j==0) {
                    if(i==j) {
                     list.add(i);
                    }
                }

            }

        }
        return list.get(list.size() - 1);

       */
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int num1=sc.nextInt();
        System.out.print("İkinci sayi giriniz: ");
        int num2=sc.nextInt();
        System.out.println("obeb(num1,num2) = " + obeb(num1, num2));
        System.out.println("okekBul(num1,num2, obeb(num1, num2)) = " + okekBul(num1, num2, obeb(num1, num2)));

    }

    private static int okekBul(int num1, int num2, int obeb) {
       return Math.abs(num1*num2)/obeb(num1,num2);
    }

    private static int obeb(int num1, int num2) {
        ArrayList<Integer>list=new ArrayList<Integer>();
        for (int i =1; i <=Math.max(num1,num2); i++) {
            for (int j =1; j <Math.min(num1, num2) ; j++) {
                if(num1%i==0&&num2%j==0){
                    if(i==j) {
                        list.add(i);
                    }
                }

            }

        }
        return list.get(list.size()-1);


    }


}




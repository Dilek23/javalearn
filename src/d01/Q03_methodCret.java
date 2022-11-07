package d01;

import java.util.Scanner;

public class Q03_methodCret {
    /*
 cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
  */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen m ve km dönüştürmek istediginizz sayıyı giriniz:");
        double sentiMeter = sc.nextDouble();
        System.out.println(meter(sentiMeter) + " metre");
        System.out.println(kilometer(sentiMeter) + " km");
        convertFromSM(sentiMeter);
    }
    public static double meter (double x){
        return x/100;
    }
    public static double kilometer (double y) {
        return y / 100000;
    }
    public static void convertFromSM(double sayi){
        System.out.println("girilen santimeter degeri : " + sayi/100 + " metre\n" + sayi/100000 + " kilometredir");
    }




}

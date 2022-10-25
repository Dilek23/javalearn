package j13_break_contuniue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        // task-> girilen tam sayının asal olmasını cntrol eden kod creat ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=sc.nextInt();//23 asalmı
        boolean asalMi=true;
for( int i=2;i<sayi;i++){
    if(sayi%i==0){
        asalMi=false;
        break;
    }
}
if(asalMi){
    System.out.println("Girilen sayı asal");
}else System.out.println("girilen sayi asal değil");
    }
}

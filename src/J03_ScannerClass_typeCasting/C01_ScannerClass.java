package J03_ScannerClass_typeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("İsminizi giriniz:");
        //char ch=sc.nextLine().charAt(4);// kullanıcıdan gelen strin ifadenin 0. indeks ilk karaterini alır.
      // System.out.println("isminizin ikinci karakteri:"+ch);
       //String isim=sc.nextLine(); // kullanıncının girdiği tüm satırı isme atar
       String ad=sc.next();// kullanıcının girdiği ilk ifadeyi ad a atar.
        System.out.println("ad = " + ad);
    }
}

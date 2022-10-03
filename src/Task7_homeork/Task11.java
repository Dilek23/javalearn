package Task7_homeork;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.

       */
        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen adınızı soyadınızı giriniz:");
        String ads= sc.nextLine();
       int one=ads.indexOf(' ');
       int two=ads.length();
        System.out.println("adi:"+ads.substring(1,one));
        System.out.println("Soyad:"+ads.substring(one,two));

    }
}

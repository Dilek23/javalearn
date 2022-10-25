package d01;

import java.util.Scanner;

public class Q12_StrnMan {
    public static void main(String[] args) {
// Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
// Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz:");
        String word= sc.nextLine();
        int bosluk=word.indexOf(" ");
        if(bosluk==-1 && !word.isEmpty()){// boşluk yoksa ve string ifadem boş degilse
            System.out.println("Şartlara uygun");

        }else System.out.println("sartlara uygun degildir");




    }
}

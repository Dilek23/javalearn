package Task5;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        int yas= sc.nextInt();
        System.out.println("lütfen kilonuzu giriniz:");
        int kg=sc.nextInt();
      /*  if(yas<=18)
            System.out.println("Kan bagısı yapamazsınız:");
        else if(yas>18&& kg<=50){
            System.out.println("Kan bagışı yapamazsınız:");
        }
       else if(yas>18 && kg>50){
            System.out.println("Kan bagışı yapabilirsiniz:");
        }
       else System.out.println("yanlış yada eksik bilgi girdiniz");

       */
        System.out.println(yas<=18?"Kan bagışı yapamazsınız":(yas>=18&& kg<=50)?"Kan bagışı yapamazsınız":(yas>18&& kg>50)?"Kan bagışı yapabilirsiniz":"Yanlış yada eksik bilgi girdiniz");

    }

}

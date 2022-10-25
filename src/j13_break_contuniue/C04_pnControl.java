package j13_break_contuniue;

import java.util.Scanner;

public class C04_pnControl {
    public static void main(String[] args) {
        //String dattype bir pin datasını 3 giriş hakkında kontrol eden code creat et.
        Scanner sc=new Scanner(System.in);

        String dogruPin="javaCAN";

        int girişHakki=3;
     while (true){
         System.out.println("bir pin  giriniz");
         String pin=sc.nextLine();
         if(pin.equals(dogruPin)){
             System.out.println("Pin basarılı:)");
             break;
         }else {
             System.out.println("yanlış tekrar dene");
             girişHakki--;
             System.out.println("kalan hakkınız"+girişHakki);
             if(girişHakki==0){
                 System.out.println("hakkınız kalmadı bir daha deneyin");
                 break;
             }
         }
     }



    }

}

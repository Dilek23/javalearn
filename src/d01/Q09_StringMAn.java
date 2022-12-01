package d01;

import java.util.Scanner;

public class Q09_StringMAn {
    /*
  Kullanicidan bir kelime girmesini isteyin.
  * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
  * kelimenin ortasindaki karakteri yazdirin.
  */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir kelime girin:");
        String kelime=sc.nextLine();
        char ortancaKrkt=kelime.charAt((kelime.length()-1)/2);
        if(kelime.length()%2!=0&&kelime.length()>=3){
            System.out.println("ortanca karakter:"+ortancaKrkt);
        }else {
            System.out.println("Tek sayıda karakter içeren bir kelime girdiniz:");
        }





    }
}

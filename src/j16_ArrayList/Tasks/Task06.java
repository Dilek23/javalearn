package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /* TASK :
 Kullanıcıdan alacağınız 6 elemanlı bir dizinin
 sadece tek elemanlarını ayrı diziye bir metodda atayarak
  yazdırınız.
Array degil list yapcaz çnkü boyutunu bilmiyoruz degisecek
 */
int sayiArr[]=new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < sayiArr.length ; i++) {
            System.out.print(  i+1+" . elemanı giriniz:");
          sayiArr[i]= sc.nextInt();

        }
        System.out.println("tekeleman(sayiArr) = " + tekeleman(sayiArr));


    }//main

    private static ArrayList<Integer> tekeleman(int[] sayiArr) {
        ArrayList<Integer>tekSayilar=new ArrayList<>();// tek sayıların atanacagı boş liste
        for (int i = 0; i < sayiArr.length ; i++) {
            if(sayiArr[i]%2==1){
                tekSayilar.add(sayiArr[i]);
            }
        }
        return tekSayilar;
    }
}

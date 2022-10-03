package j10_StringManipulation;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
    /*girilen string içindeki istenen indexi karakteri kod et

     */

        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin gir");
        String str= sc.nextLine();
        System.out.println("istenen karakter indexi gir");
        int index= sc.nextInt();
        if (str.length()>index){
           // System.out.println(str.substring(index, index + 1));
            System.out.println(str.charAt(index));
        }else System.out.println("index yok");



    }
}

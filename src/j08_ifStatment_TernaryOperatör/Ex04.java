package j08_ifStatment_TernaryOperatör;

import java.util.Scanner;

public class Ex04 {
    /*
    TASK-> girilen karakterin harf olup  olmadığını kontrol eden code crerat ediniz.

     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("bir karakter giriniz:");
        char ch=sc.nextLine().charAt(0);

        if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z')){
            System.out.println("girdiiğiniz karakter harftir.");
        }
else System.out.println("girdiğiniz karakter harf değildir:(");

    }
}

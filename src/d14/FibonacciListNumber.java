package d14;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciListNumber {  /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
     Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz :");
        int sayi = scan.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);
        int i=1;
        if (sayi<=1){
            System.out.println("daha büyük sayi giriniz...");
        }else {
            while (fibonacci.get(i)<sayi){
                fibonacci.add((fibonacci.get(i)+fibonacci.get(i-1)));
            }
        }
    }
}

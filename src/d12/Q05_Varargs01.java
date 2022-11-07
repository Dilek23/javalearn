package d12;

import java.math.BigDecimal;

public class Q05_Varargs01 {
    public static void main(String[] args) {
        // istedigimiz kadar sayı girdigimizde toplamları bize veren bir metod yazalım...

       /* sumAll(5,9,-12,0,100,23,8,67,44);

    }

    private static void sumAll(int...sayi) {
        int toplam =0;
        for (int each:sayi) {
            toplam += each;
            
        }
        System.out.println("toplam = " + toplam);
    }
// Create a multiply method with double varargs (return double)


        */
      multiply(1.2,2.3,2.0,5,4.0);
    }

    private static void multiply(double...sayi) {
        double crpm=1;
        for (double a:sayi ) {
           crpm*=a; 
            
        }
        System.out.println("crpm = " + crpm);
    }
    

}

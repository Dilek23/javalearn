package J03_ScannerClass_typeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
        private static double d1;

        public static void main(String[] args) {
        /*
 byte < short < int < long < float < double
   Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina
Java  otomatik olarak yapar.

 */
    boolean basarılı=true;
        //String basarı=basarılı; -> dogal uyum olmayan variable'larda castşng yapılamaz CTE
        boolean basarı=basarılı;
     double d=17;// double variabla int 17 atandı k->b
        System.out.println("d = " + d);
        int sayi1=33;
        int sayi2=7;
        System.out.println(sayi1/sayi2);//4
        /*
        java iki int sayıyı birbirine böldüğünüde sonucu int verir
        eğer bölme işleminde ondalık sonuç çıkarsa ondalık kısmı siler
         */
byte b=127;
int i=b;//küçüğü büyüğe atadık

            int num = 2;
        System.out.println("i = " + i);//127
        double db= d1 / num;// iki farklı data type sayı işleme girerse java küçük olan data türü için autowedding yapar 
        //sonucu büyük olan data type yazar.
        System.out.println("db = " + db);
          /*
		 byte < short < int < long < float < double
		 Explicit Narrowing Casting ->Buyuk data type'larini kucuk data type'larina cevirme islemini veri kaybndan dolayı
		 Java otomatik olarak yapmaz. kod ile teyit ister...

		 */
        double d2 = 14.53;
        int num2 = (int) d2;//b->k
        System.out.println("num2 = " + num2);//14
        int num3=150;
        byte b1= (byte) num3;
        System.out.println("b1 = " + b1);//b1 = -106
        double d3 = 333;
        long l = (long) d3;

        double d4=571.4444;
        long l2= (long) d4;
        System.out.println("l2 = " + l2);//l2 = 571
        /* task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("ascii değeri istediğin karakteri gir:");
        char ch=sc.nextLine().charAt(0);
        int chasciiDegeri=ch;
        System.out.println(ch+"'ın chasciiDegeri = " + chasciiDegeri);
    }
}
